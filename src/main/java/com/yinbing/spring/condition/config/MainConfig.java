package com.yinbing.spring.condition.config;

import com.yinbing.spring.configuration.bean.Car;
import com.yinbing.spring.configuration.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

public class MainConfig {

    @Bean
    public Car car(){
        return new Car();
    }

    @Bean
    @Conditional(value = MyCondition.class)
    public Person person(){
        return new Person();
    }
}
