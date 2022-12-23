package com.xgrt.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.xgrt")
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy
@EnableTransactionManagement//告诉Spring是用注解的方式做事务管理
@Import({JDBCConfig.class,MyBatisConfig.class})
public class SpringConfig {
}
