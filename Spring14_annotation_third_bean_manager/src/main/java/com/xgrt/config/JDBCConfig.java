package com.xgrt.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.xgrt.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

//@Configuration//不推荐
public class JDBCConfig {
    @Value("com.mysql.cj.jdbc.Driver")
    private String drive;
    @Value("jdbc:mysql://localhost:3306/spring_db")
    private String url;
    @Value("root")
    private String userName;
    @Value("123456")
    private String password;


    //1.定义一个方法获得要管理的对象
    //2.添加@Bean，表示当前方法的返回值是一个bean
    @Bean
    public DataSource dataSource(BookDao bookDao)
    {
        System.out.println(bookDao);//自动装配（按类型）
        DruidDataSource ds=new DruidDataSource();
        ds.setDriverClassName(drive);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        return ds;
    }
}
