package com.xgrt.service.impl;

import com.xgrt.dao.BookDao;
import com.xgrt.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    //5.删除业务层中使用new的方式创建的dao对象
    private BookDao bookDao/*=new BookDaoImpl()*/;

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    //6.提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        System.out.println("set……");
        this.bookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Service destroy……");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Service init……");
    }
}
