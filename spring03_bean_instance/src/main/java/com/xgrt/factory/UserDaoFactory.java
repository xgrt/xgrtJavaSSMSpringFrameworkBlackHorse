package com.xgrt.factory;


import com.xgrt.dao.UserDao;
import com.xgrt.dao.impl.UserDaoImpl;

//实例工厂创建对象
public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
