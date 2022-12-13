package com.xgrt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.xgrt")
@PropertySource("classpath:jdbc.properties")//多个就要用数组的形式来写，不支持使用通配符
public class SpringConfig {
}
