package org.koreait.member.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller

public class MemberController2 {
    @Autowired
 private HttpServletRequest request;
    @Autowired
    private HttpServletResponse response;
    @Autowired
    private HttpSession session;
/*    @GetMapping("/member/login")
    public String login(@RequestParam("name") String name){
        System.out.printf("name=%s%n", name);
        return "member/form";
    }*/
    /*@GetMapping("/member/login")*/
/*    public String login(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
        return "member/form";
    }*/
/*    public String login(){
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
        return "member/form";
    }*/
  /*  public ModelAndView login(){
        ModelAndView mv= new ModelAndView();
        mv.addObject("message","안녕하세요");
        mv.setViewName("member/form");
        return mv;
    }*/

    /*@GetMapping("member/login")
    public String login(Model model) {

        model.addAttribute("message", "안녕하세요");
        return "member/form";
    }
    @PostMapping("member/login")
    public String loginPs(RequestLogin form){
        System.out.println(form);
        return "member/form";
    }*/

   /*  @PostMapping("/member/login")
    public String loginps(@RequestParam("email") String email,@RequestParam("password") String pass,@RequestParam(value = "saveEmail", required = false) boolean saveEmail){
         System.out.println("회원가입 처리쪽 유입");
         System.out.printf("email=%s, password=%s, saveEmail%s%n",email,pass,saveEmail);
        return "member/form";
     }*/
}
