package com.xgrt;

import com.xgrt.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class AppSystemProperties {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*DataSource druidDataSource=(DataSource) ctx.getBean("druidDataSource");
        DataSource comboPooledDataSource = (DataSource) ctx.getBean("comboPooledDataSource");
        System.out.println(druidDataSource);
        System.out.println(comboPooledDataSource);*/
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}
