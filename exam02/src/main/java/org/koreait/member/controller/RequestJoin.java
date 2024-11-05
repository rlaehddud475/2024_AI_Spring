package org.koreait.member.controller;

import lombok.Data;
import org.springframework.stereotype.Controller;

@Controller
@Data
public class RequestJoin {
    private String email;
    private String password;
    private String confirmPassword;
    private String userName;
    private boolean agrees;

}
