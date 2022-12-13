package com.xgrt;

import com.xgrt.config.SpringConfig;
import com.xgrt.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
//        bookDao.update();
        System.out.println(bookDao);//Spring对代理的toString方法进行了重写
        System.out.println(bookDao.getClass());
    }
}
