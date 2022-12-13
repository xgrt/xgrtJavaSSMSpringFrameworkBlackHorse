package com.xgrt.service.impl;

import com.xgrt.dao.BookDao;
import com.xgrt.dao.UserDao;
import com.xgrt.service.BookService;

public class BookServiceImpl implements BookService {
    //5.删除业务层中使用new的方式创建的dao对象
    private BookDao bookDao/*=new BookDaoImpl()*/;
    private UserDao userDao;

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }


    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }

    //6.提供对应的set方法
}
