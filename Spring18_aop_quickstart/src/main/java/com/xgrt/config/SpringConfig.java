package com.xgrt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.xgrt")
@EnableAspectJAutoProxy//告诉Spring这里有用注解开发的AOP
public class SpringConfig {
}
