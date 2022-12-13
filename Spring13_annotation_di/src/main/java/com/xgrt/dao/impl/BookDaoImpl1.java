package com.xgrt.dao.impl;

import com.xgrt.dao.BookDao;
import org.springframework.stereotype.Repository;

//@Component("bookDao")
@Repository("bookDao")
public class BookDaoImpl1 implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }


}
