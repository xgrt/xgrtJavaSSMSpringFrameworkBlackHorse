package com.xgrt;

import com.xgrt.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifecycle {
    public static void main(String[] args) {
//        ApplicationContext没有close方法，但是它的实现类的close方法
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao=(BookDao) ctx.getBean("bookDao");
        bookDao.save();
//        ctx.registerShutdownHook();//任何时间都可以
        ctx.close();//比较暴力
    }
}
