package com.xgrt.dao.impl;

import com.xgrt.dao.ResourceDao;
import org.springframework.stereotype.Repository;

@Repository
public class ResourceDaoImpl implements ResourceDao {
    @Override
    public boolean readResource(String url, String password) {
        //模拟校验
        return password.equals("123456");
    }
}
