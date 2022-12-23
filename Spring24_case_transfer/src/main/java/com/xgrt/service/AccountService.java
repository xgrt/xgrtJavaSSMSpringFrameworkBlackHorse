package com.xgrt.service;


import org.springframework.transaction.annotation.Transactional;

public interface AccountService {
    /**
     * 转账操作
     * @param out 转出方
     * @param in 转入方
     * @param money 金额
     */
    @Transactional//代表开启事务（标准写法）
    void transfer(String out,String in,Double money);
}
