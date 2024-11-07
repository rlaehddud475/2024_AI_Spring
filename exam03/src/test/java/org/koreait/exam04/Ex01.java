package org.koreait.exam04;

import org.junit.jupiter.api.Test;
import org.koreait.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    private  AnnotationConfigApplicationContext ctx;
@Test
    void test1(){


Calculator cal= ctx.getBean(Calculator.class);
    long result = cal.factorial(10l);
    System.out.println(result);
    ctx.close();
}
@Test
    void test2(){
    Calculator cal =ctx.getBean(Calculator.class);

}
}
