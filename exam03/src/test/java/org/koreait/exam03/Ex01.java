package org.koreait.exam03;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

public class Ex01 {
@Test
    void test1(){
    Class<RacCalculator> clazz = RacCalculator.class;
    Calculator cal= (Calculator) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[] {Calculator.class},new PerformmanceHandler(clazz));
    long result = cal.factorial(10l);
    System.out.println(result);
}
}
