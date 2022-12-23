package com.xgrt.service;


import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

public interface AccountService {
    @Transactional(rollbackFor = {IOException.class})//问题：有些异常不是RuntimeException，不会自动回滚,如IOException
    //解决方法：设置rollbackFor属性，把这些异常的类做成一个数组作为属性的值
    void transfer(String out, String in, Double money);
}
