package org.koreait.global.configs;

import org.koreait.member.repository.MemberRepository;
import org.koreait.member.services.InfoService;
import org.koreait.member.services.JoinService;
import org.koreait.member.validator.JoinValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(AppCtx2.class)
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
    @Bean
    public InfoService infoService(){
        InfoService service = new InfoService();
        service.setRepository(memberRepository());
        return service;
    }
}
