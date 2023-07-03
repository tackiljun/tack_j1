package org.zerock.j1.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

// 스프링부트3버전부터는 자바가 아닌 자카르타로.
@Entity
@Table(name = "tbl_sample")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class Sample {
    
    @Id
    private String keyCol;
    // 엔티티클래스라고 할거야.
    // 엔티티클래스와 엔티티인스턴스는 다른거.

    private String first;

    private String last;

}
