package org.koreait.exam02;

import java.util.HashMap;
import java.util.Map;

public class CachedCalculator implements Calculator{
    private Map<Long,Long> cache=new HashMap<>();
    private Calculator cal;
    public CachedCalculator(Calculator cal){
        this.cal=cal;
    }

    @Override
    public long factorial(long num) {
        if (cache.containsKey(num)){
            return cache.get(num);
        }
long result=cal.factorial(num);
        cache.put(num,result);
        System.out.println("캐시에 값을 저장!");
        return 0;
    }
}
