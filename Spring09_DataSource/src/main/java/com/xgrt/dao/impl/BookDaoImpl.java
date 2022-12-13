package com.xgrt.dao.impl;

import com.xgrt.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void save() {
        System.out.println("book dao save ..."+name);
    }


}
