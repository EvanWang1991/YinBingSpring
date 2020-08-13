package com.yinbing.spring.configuration.config;

import com.yinbing.spring.configuration.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MainConfig {

    @Bean(name = "person2")
    public Person person(){
        return new Person();
    }
}
