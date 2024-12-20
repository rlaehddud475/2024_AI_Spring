package org.koreait.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

@Aspect
public class SpringProxyCalculator {

/*    @Pointcut("execution(* org.koreait.exam04..*(..)")
    public void publicTarget(){}*/
/*@Before("publicTarget()")
public void beforeProcess(JoinPoint joinPoint) throws Throwable{
    System.out.println("@Before!!");
}
@After("publicTarget()")
public void afterProcess(JoinPoint joinPoint) throws Throwable{
    System.out.println("@After!!");
}*/
    @Around("execution(* org.koreait.exam04..*(..)")
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
