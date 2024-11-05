package org.koreait.member.services;

import org.koreait.member.controller.RequestJoin;
import org.koreait.member.repository.MemberRepository;
import org.koreait.member.validator.JoinValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class JoinService {
    @Autowired
public JoinValidator validator;
@Autowired
@Qualifier("mRepo")
    public MemberRepository repository;
    @Autowired @Qualifier("mRepo2")
    public MemberRepository repository2;
    public void process(RequestJoin form){
validator.validate(form);
repository.register(form);
}
public JoinService(){
    this.validator=validator;
    this.repository=repository;
}

}
