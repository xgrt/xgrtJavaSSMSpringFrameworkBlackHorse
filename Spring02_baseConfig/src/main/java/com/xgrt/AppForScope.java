package com.xgrt;

import com.xgrt.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForScope {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDao bookDao1=(BookDao) ctx.getBean("bookDao");
        BookDao bookDao2=(BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao1);
        System.out.println(bookDao2);//未配置xml，地址相同。
        // 配置xml scope="prototype"后，地址不同
        // 说明scope默认是单例模式
    }
}
