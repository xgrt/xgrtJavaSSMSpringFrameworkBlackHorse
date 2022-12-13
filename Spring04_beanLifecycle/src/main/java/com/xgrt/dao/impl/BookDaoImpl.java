package com.xgrt.dao.impl;

import com.xgrt.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }

    //表示bean初始化对应的操作
    public void init()//不能带参数
    {
        System.out.println("init……");
    }

    public void destroy()//不能带参数
    {
        System.out.println("destroy……");
    }
}
