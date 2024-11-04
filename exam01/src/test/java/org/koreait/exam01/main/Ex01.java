package org.koreait.exam01.main;

import org.junit.jupiter.api.Test;
import org.koreait.Greeter;
import org.koreait.exam01.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    @Test
    void test1(){
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppCtx.class);
        Greeter g1= ctx.getBean("greeter", Greeter.class);
        g1.hello("동영");
        Greeter g2= ctx.getBean("greeter", Greeter.class);
        System.out.println(g1==g2);//싱글톤 객체
        ctx.close();
    }
}
