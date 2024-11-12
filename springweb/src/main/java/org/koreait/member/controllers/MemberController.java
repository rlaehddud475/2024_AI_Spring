package org.koreait.member.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
@RequestMapping("/member")
public class MemberController {

/*@RequestMapping(path = {"/member/login","user/login"},method = {RequestMethod.GET,RequestMethod.POST})
    public String login(){
        return "member/form";
    }*/
    /*@GetMapping(path = "/login", params = "type")*/
    @GetMapping("/login")
    public String login(){
        return "member/form";
    }
    @PostMapping("/login")
    public String loginPs(){
        return "member/joinForm";
    }
    @GetMapping("/join")
    public String join(){
        return "member/joinForm";

    }
    @PostMapping("/join")
    public String joinPs(RequestJoin form/*, Model model*/){
        /*회원가입 처리 완료후 주소이동(로그인 페이지)
        * 응답해더 Location:/springweb/member/login
        * response.sendRedirect(request.getContextPath()+"/member/login);
        * */
        System.out.println(form);//커멘드 객체는 자동으로
/*        String[] hobby=form.getHobby();
        System.out.println(Arrays.toString(hobby));*/
        // EL속성으로 추가, 속성명이 클래스명, 앞자는 소문자 RequestJoin -> requestJoin
/*        model.addAttribute("requestJoin",form);*/
        return "/member/joinForm";

    }
}
