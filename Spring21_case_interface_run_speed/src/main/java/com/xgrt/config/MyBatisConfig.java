package com.xgrt.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MyBatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
        SqlSessionFactoryBean ssfB=new SqlSessionFactoryBean();
        ssfB.setTypeAliasesPackage("com.xgrt.domain");
        ssfB.setDataSource(dataSource);//引用类型DataSource对象的注入
        return ssfB;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc=new MapperScannerConfigurer();
        msc.setBasePackage("com.xgrt.dao");//设置基本配置的位置
        return msc;
    }
}
