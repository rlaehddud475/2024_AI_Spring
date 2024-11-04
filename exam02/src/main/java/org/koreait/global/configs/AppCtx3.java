package org.koreait.global.configs;

import org.koreait.member.repository.MemberRepository;
import org.koreait.member.validator.JoinValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx3 {
@Bean
    public JoinValidator joinValidator(){
    return new JoinValidator();
}
@Bean
    public MemberRepository memberRepository(){
    return new MemberRepository();
}
}
