package org.koreait.config;

import org.koreait.exam04.Calculator;
import org.koreait.exam04.RacCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppCtx {
    @Bean
    public SpringProxyCalculator springProxyCalculator(){
        return new SpringProxyCalculator();
    }
    @Bean
public RacCalculator calculator(){
    return new RacCalculator();
}
}
