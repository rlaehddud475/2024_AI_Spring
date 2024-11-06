package org.koreait.exam04;

import org.junit.jupiter.api.Test;
import org.koreait.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
@Test
    void test1(){
    AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppCtx.class);
    RacCalculator cal = ctx.getBean(RacCalculator.class);

    long result = cal.factorial(10l);
    System.out.println(result);
    ctx.close();
}
}
