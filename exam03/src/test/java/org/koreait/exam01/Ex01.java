package org.koreait.exam01;

import org.junit.jupiter.api.Test;
import org.koreait.exam01.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    @Test
    void test1(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        Message m1=ctx.getBean(Message.class);
        m1.send("안녕하세요!");
        Message m2=ctx.getBean(Message.class);
        System.out.println(m1==m2);
        ctx.close();

    }
    @Test
    void test2(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        Message2 m1 =ctx.getBean(Message2.class);
        Message2 m2 =ctx.getBean(Message2.class);
        System.out.println(m1==m2);

        ctx.close();

    }
}
