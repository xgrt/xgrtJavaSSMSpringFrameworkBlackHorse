package com.xgrt.dao.impl;

import com.xgrt.dao.BookDao;
import org.springframework.core.codec.StringDecoder;

public class BookDaoImpl implements BookDao {
    private int connectionNum;
    private String databaseName;

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void save() {
        System.out.println("book dao save ..."+databaseName+","+connectionNum);
    }


}
