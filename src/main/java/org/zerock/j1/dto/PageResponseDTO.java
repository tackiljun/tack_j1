package org.zerock.j1.dto;

import java.util.List;

import lombok.Data;

@Data
public class PageResponseDTO<E> {
    
    private List<E> dtoList;

    private long totalCount;

    private List<Integer> pageNums;

    private boolean prev, next;

    private PageRequestDTO requestDTO;

    private int page, size, start, end;

    // JPA의 페이지인프리? 와 비슷하다.
    public PageResponseDTO(List<E> dtoList, long totalCount, PageRequestDTO pageRequestDTO) {
        this.dtoList = dtoList;
        this.totalCount = totalCount;
        this.requestDTO = pageRequestDTO;

        this.page = pageRequestDTO.getPage();
        this.size = pageRequestDTO.getSize();

        // page번호가 13이라 가정. -> 1.3 -> 2.0
        int tempEnd = (int) (Math.ceil(page/10.0) * 10);

        this.start = tempEnd - 9;
        this.prev = this.start != 1;

        // tempEnd가 20이다. 178건밖에 없어.-> 17.8
        int realEnd = (int) (Math.ceil(totalCount/(double)size));

        this.end = tempEnd > realEnd ? realEnd: tempEnd;

        this.next = (this.end * this.size) < totalCount;

    }

    



}
