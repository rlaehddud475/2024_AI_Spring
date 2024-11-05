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
}
