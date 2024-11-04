package org.koreait.member.services;

import org.koreait.global.validators.Validator;
import org.koreait.member.Repository.MemberRepository;
import org.koreait.member.controller.RequestJoin;
import org.koreait.member.validator.JoinValidator;

public class JoinService {
    private final MemberRepository repository;
    private final Validator<RequestJoin> joinValidator;

    /*의존 관계 joinService 객체 생성을 위해서는 joinValidator가 필수*/
    public JoinService(Validator<RequestJoin> joinValidator, MemberRepository repository) {
        this.joinValidator = joinValidator;
        this.repository=repository;
    }

    public  void  setValidator(Validator<RequestJoin> joinValidator){
        this.joinValidator=joinValidator;
    }
    public void process(RequestJoin form){
        //form,joinService에 서로 영향을 주고 받는 관계 /변화에 영향을 받음
        //통제가 필요 - 메서드 안에 감출필요 캡슐화 /변화에 닫힌 구조
        joinValidator.check(form);
    }
}
