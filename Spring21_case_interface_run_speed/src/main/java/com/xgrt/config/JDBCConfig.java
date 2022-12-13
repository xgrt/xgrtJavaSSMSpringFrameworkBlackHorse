package com.xgrt.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JDBCConfig {
    @Value("${jdbc.driver}")
    private String drive;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String userName;
    @Value("${jdbc.password}")
    private String password;


    @Bean
    public DataSource dataSource()
    {
        DruidDataSource ds=new DruidDataSource();
        ds.setDriverClassName(drive);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        return ds;
    }
}
