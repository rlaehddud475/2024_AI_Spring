package org.koreait.exam02;

public class RacCalculator implements Calculator{
    @Override
    public long factorial(long num) {
       if (num<1l){
           return 1l;       }
        return num*factorial(num-1l);
    }
}
