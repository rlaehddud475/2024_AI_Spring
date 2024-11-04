package org.koreait.member.services;

import org.koreait.member.Repository.MemberRepository;
import org.koreait.member.validator.JoinValidator;

public class ServiceContainer {
    public JoinValidator joinValidator(){
        return new JoinValidator();
    }
    public JoinService joinService(){
        return new JoinService(joinValidator(),memberRepository());
    }
    public JoinService2 joinService2(){
        return new JoinService2(joinValidator());
    }
    public MemberRepository memberRepository(){
        return new MemberRepository();
    }
}
