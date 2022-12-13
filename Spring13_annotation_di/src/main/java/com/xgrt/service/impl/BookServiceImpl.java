package com.xgrt.service.impl;

import com.xgrt.dao.BookDao;
import com.xgrt.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Component
@Service
public class BookServiceImpl implements BookService {

    @Autowired//可以按名称，但是不推荐
    @Qualifier("bookDao2")
    private BookDao bookDao;


    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    /*public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }*/
}
