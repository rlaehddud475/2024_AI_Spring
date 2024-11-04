package org.koreait.exam01;

import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx;
import org.koreait.global.configs.AppCtx2;
import org.koreait.global.configs.AppCtx3;
import org.koreait.member.controller.RequestJoin;
import org.koreait.member.services.InfoService;
import org.koreait.member.services.JoinService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex01 {
    @Test
    void test1(){
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppCtx3.class);
        JoinService service = ctx.getBean("joinService",JoinService.class);
//        InfoService infoService=ctx.getBean("infoService",InfoService.class);
        InfoService infoService = ctx.getBean(InfoService.class);
        RequestJoin form=new RequestJoin();
        form.setEmail("user01@test.org");
        form.setPassword("12345678");
        form.setConfirmPassword("12345678");
        form.setUserName("사용자01");
       form.setAgrees(true);
       service.process(form);
       infoService.print();
        ctx.close();
    }
    @Test
    void test2(){
        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppCtx.class, AppCtx2.class);
        DateTimeFormatter formatter =ctx.getBean(DateTimeFormatter.class);
        String str = formatter.format(LocalDateTime.now());
        System.out.println(str);
        ctx.close();
    }
}
