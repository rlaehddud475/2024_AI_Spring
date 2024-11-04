package org.koreait.member.services;

import org.koreait.global.validators.Validator;
import org.koreait.member.controller.RequestJoin;
import org.koreait.member.validator.JoinValidator;

public class JoinService {
    private Validator<RequestJoin> joinValidator;

    /*의존 관계 joinService 객체 생성을 위해서는 joinValidator가 필수*/
    public JoinService(Validator<RequestJoin> joinValidator) {
        this.joinValidator = joinValidator;
    }

    public  void  setValidator(Validator<RequestJoin> joinValidator){
        this.joinValidator=joinValidator;
    }
    public void process(RequestJoin form){
    
    }
}
