package org.koreait.exam02;

public class ImplCalculator implements Calculator {
    @Override
    public long factorial(long num) {
        long result = 1l;
        for (long i = 1l; i<=num; i++){
            result*=i;
        }
        return result;
    }
}
