package com.yinbing.spring.condition.config;

import com.yinbing.spring.condition.config.bean.Car;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        if(context.getBeanFactory().containsBean("car")){
            return true;
        }
        return false;
    }
}
