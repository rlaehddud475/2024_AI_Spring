package org.koreait.global.configs;

import org.koreait.member.repository.MemberRepository;
import org.koreait.member.services.JoinService;
import org.koreait.member.validator.JoinValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {
    @Bean
    public JoinValidator joinValidator(){return new JoinValidator();}
    @Bean
    public MemberRepository memberRepository(){
        return new MemberRepository();
    }
    @Bean
    public JoinService joinService(){
        return new JoinService(joinValidator(),memberRepository());
    }
}
