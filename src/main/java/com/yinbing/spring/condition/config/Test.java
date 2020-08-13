package com.yinbing.spring.condition.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
            System.out.println("beanName = " + beanDefinitionName);
            
        }

    }
}
