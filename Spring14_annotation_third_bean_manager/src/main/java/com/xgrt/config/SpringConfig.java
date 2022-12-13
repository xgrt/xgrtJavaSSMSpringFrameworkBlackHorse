package com.xgrt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.xgrt")//不推荐
@Import(JDBCConfig.class)//推荐
public class SpringConfig {

}
