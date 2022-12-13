package com.xgrt.factory;

import com.xgrt.dao.UserDao;
import com.xgrt.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    @Override
    //代替原始实例中创建对象的方法
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    @Override
    public boolean isSingleton() {
        return true;//设置初始化对象是否为单例，默认为true(是单例的)
    }
}
