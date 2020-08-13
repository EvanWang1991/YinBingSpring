package com.yinbing.spring.componentScan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

//@ComponentScan(basePackages = {"com.yinbing.spring.componentScan"})

@ComponentScan(basePackages = {"com.yinbing.spring.componentScan"}, excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,
                                                                                                            value = {Controller.class})})
public class MainConfig {
}
