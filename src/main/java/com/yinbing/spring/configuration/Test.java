package com.yinbing.spring.configuration;

import com.yinbing.spring.configuration.bean.Person;
import com.yinbing.spring.configuration.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        System.out.println(applicationContext.getBean("person2"));
    }
}
