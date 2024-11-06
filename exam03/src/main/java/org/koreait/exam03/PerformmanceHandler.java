package org.koreait.exam03;

import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.*;

public class PerformmanceHandler implements InvocationHandler, java.lang.reflect.InvocationHandler {

    private final Class<?> clz;
    public PerformmanceHandler(Class<?> clz){

        this.clz = clz;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       long stime=System.nanoTime();
        try {

        Object obj = clz.getDeclaredConstructor().newInstance();
        Object result = method.invoke(obj,args);
        return result;}
       finally {
           long etime=System.nanoTime();
            System.out.printf("걸린시간: %d%n",etime-stime);
       }

    }
}
