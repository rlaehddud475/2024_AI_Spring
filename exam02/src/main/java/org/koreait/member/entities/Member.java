package org.koreait.member.entities;

import lombok.Data;
import lombok.Locked;

import java.time.LocalDateTime;

@Data
public class Member {
private long seq;
private String email;
private String password;
private String userName;
private LocalDateTime regDt;
    private LocalDateTime modDt;
}
