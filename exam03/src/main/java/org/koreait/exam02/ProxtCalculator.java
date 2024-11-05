package org.koreait.exam02;

public class ProxtCalculator implements Calculator{
    private Calculator cal;
    public ProxtCalculator(Calculator cal){
        this.cal=cal;
    }
    @Override
    public long factorial(long num) {
        long stime=System.nanoTime();
   try {
       long result=cal.factorial(num);
       return result;
   }finally {
       long etime=System.nanoTime();       System.out.printf("걸린시간 %d%n",etime-stime);
   }

    }

}
