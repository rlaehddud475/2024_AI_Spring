<<<<<<< HEAD
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
=======
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
>>>>>>> 95a0d84a9646fb6574002e252d452f4ea20b80c0
