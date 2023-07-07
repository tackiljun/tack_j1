package org.zerock.j1.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public interface BoardReadDTO {
    
    Long getBno();
    String gettitle();
    String getcontent();
    
    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
    LocalDateTime getRegDate();

    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
    LocalDateTime getModDate();
    
}