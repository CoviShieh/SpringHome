package com.config;

import com.pojo.A;
import com.pojo.C;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiewh
 * @create 2021-12-16 16:10
 * @Description
 */
@Configuration
@ComponentScan("com.pojo")
public class MyConfig {

    @Bean
    public A a(){
        return new A(c());
    }

    @Bean
    public C c(){
        return new C(a());
    }
}
