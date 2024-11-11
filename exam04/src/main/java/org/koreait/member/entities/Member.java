package org.koreait.member.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
public class Member {
    @Id
    private Long seq;
    private String email;
    private String password;
    private  String username;
    private LocalDateTime regDt;
    private LocalDateTime modDt;
}
