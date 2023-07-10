package org.zerock.j1.service;

import org.springframework.transaction.annotation.Transactional;
import org.zerock.j1.dto.PageResponseDTO;
import org.zerock.j1.dto.ReplyDTO;
import org.zerock.j1.dto.ReplyPageRequestDTO;

@Transactional
public interface ReplyService {

    // 모든 리스트 리턴 타입은 PageResponseDTO
    PageResponseDTO<ReplyDTO> list(ReplyPageRequestDTO requestDTO);

    Long register(ReplyDTO replyDTO);

    ReplyDTO read(Long rno);

    void remove(Long rno);
    


}