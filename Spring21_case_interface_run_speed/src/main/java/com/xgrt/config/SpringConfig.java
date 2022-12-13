package com.xgrt.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.xgrt")
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy
@Import({JDBCConfig.class,MyBatisConfig.class})
public class SpringConfig {
}
