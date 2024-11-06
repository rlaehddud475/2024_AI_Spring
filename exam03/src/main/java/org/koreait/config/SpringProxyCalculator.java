package org.koreait.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

public class SpringProxyCalculator {

    @Pointcut("execution(* org.koreait.exam04..*(..)")
    public void publicTarget(){}

    @Around("publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable{
        long stime = System.nanoTime();
  try {
      Object result=joinPoint.proceed();

      return result;
  }finally {
      long etime = System.nanoTime();
      System.out.printf("걸린시간 : %d%n",etime-stime);
  }

    }
}
