package org.koreait.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class SpringCachedCalculator {
    private Map<Long,Object> cache= new HashMap<>();
 /*   @Pointcut("execution(* org.koreait.exam04..*(..)")
    public void publicTarget(){}*/
    @Around("CommonPointcut.publicTarget")
    public Object process(ProceedingJoinPoint joinPoint) throws  Throwable{
        Object[] args=joinPoint.getArgs();
        long num=(long)args[0];
        if (cache.containsKey(num)){
            System.out.println("캐시에서 가져옴");
            return cache.get(num);
        }
        Object result =joinPoint.proceed();

        return result;
    }

}
