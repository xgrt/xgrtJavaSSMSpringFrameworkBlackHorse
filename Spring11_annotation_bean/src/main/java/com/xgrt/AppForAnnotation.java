package com.xgrt;

import com.xgrt.config.SpringConfig;
import com.xgrt.dao.BookDao;
import com.xgrt.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);
        BookService bookService=ctx.getBean(BookService.class);
        System.out.println(bookService);
    }
}
