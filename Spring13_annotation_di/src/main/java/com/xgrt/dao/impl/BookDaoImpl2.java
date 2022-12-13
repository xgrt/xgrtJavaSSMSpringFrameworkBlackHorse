package com.xgrt.dao.impl;

import com.xgrt.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

//@Component("bookDao")
@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {
    @Value("${name}")
    private String name;
    public void save() {
        System.out.println("book dao save ...2 "+name);
    }


}
