package org.koreait.exam02;

import org.junit.jupiter.api.Test;

public class Ex01 {
    @Test
    void test1(){
        long stime=System.nanoTime();
        ImplCalculator cal1=new ImplCalculator();
        long result1=cal1.factorial(10l);
        System.out.printf("cal1=%d%n",result1);
        long etime=System.nanoTime();
        System.out.printf("cal1 걸린시간 %d%n",etime-stime);
        RacCalculator cal2=new RacCalculator();
        stime=System.nanoTime();
        long result2=cal2.factorial(10l);
        System.out.printf("cal2=%d%n",result2);
        etime=System.nanoTime();
        System.out.printf("cal2 걸린시간 %d%n",etime-stime);
    }
    @Test
    void test2(){
        ProxtCalculator cal1=new ProxtCalculator(new ImplCalculator());
        long result1=cal1.factorial(10l);
        System.out.printf("cal1=%d%n",result1);
        ProxtCalculator cal2=new ProxtCalculator(new RacCalculator());
        long result2=cal2.factorial(10l);
        System.out.printf("cal2=%d%n",result2);
    }
    @Test
    void test3(){
        CachedCalculator cal=new CachedCalculator(new ProxtCalculator(new RacCalculator()));
        long r1= cal.factorial(10l);
        System.out.printf("r1=%d%n",r1);
        long r2= cal.factorial(10l);
        System.out.printf("r2=%d%n",r2);
        long r3= cal.factorial(10l);
        System.out.printf("r3=%d%n",r3);
    }
}
