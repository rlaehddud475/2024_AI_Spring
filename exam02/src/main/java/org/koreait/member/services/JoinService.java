package org.koreait.member.services;

import org.koreait.member.controller.RequestJoin;
import org.koreait.member.repository.MemberRepository;
import org.koreait.member.validator.JoinValidator;

public class JoinService {
public JoinValidator validator;
public MemberRepository repository;
    public void process(RequestJoin form){
validator.validate(form);
repository.register(form);
}
public JoinService(JoinValidator validator, MemberRepository repository ){
    this.validator=validator;
    this.repository=repository;
}

}
