package org.koreait.config;

import org.koreait.exam04.Calculator;
import org.koreait.exam04.RacCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppCtx {
    @Bean
    @Order(2)
    public SpringCachedCalculator springCachedCalculator(){
        return new SpringCachedCalculator();
    }
    @Bean
    @Order(1)
    public SpringProxyCalculator springProxyCalculator(){
        return new SpringProxyCalculator();
    }
    @Bean
    public RacCalculator calculator(){
        return new RacCalculator();
    }
/*    @Bean
public RacCalculator calculator(){
    return new RacCalculator();
}*/
}
