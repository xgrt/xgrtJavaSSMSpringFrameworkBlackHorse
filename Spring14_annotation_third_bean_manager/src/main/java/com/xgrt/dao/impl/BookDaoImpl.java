package com.xgrt.dao.impl;

import com.xgrt.dao.BookDao;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("singleton")
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }

    @PostConstruct
    public void init() {
        System.out.println("book dao init……");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("book dao destroy ...");
    }

}
