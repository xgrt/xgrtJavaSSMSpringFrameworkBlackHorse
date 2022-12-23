package com.xgrt.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface LogService {
    @Transactional(propagation = Propagation.REQUIRES_NEW)//设置事务传播行为
    void log(String out,String in,Double money);
}
