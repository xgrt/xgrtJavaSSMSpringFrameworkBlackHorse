package com.xgrt.factory;


import com.xgrt.dao.OrderDao;
import com.xgrt.dao.impl.OrderDaoImpl;

//静态工厂创建对象
public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        System.out.println("factory setup....");
        return new OrderDaoImpl();
    }
}
