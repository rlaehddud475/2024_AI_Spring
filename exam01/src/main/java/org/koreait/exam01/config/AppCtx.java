package org.koreait.exam01.config;

import org.koreait.Greeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {
    @Bean
    public Greeter greeter(){
        return new Greeter();
    }
}
