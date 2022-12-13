package com.xgrt.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component//告诉Spring需要加载这个类
@Aspect//告诉Spring这是用来做AOP的
public class MyAdvice//通知类
{
    @Pointcut("execution(void com.xgrt.dao.BookDao.update())"/*执行到什么方法时起作用*/)//定义切入点
    private void pt(){}//方法名随便取

    @Before("pt()")//绑定通知与切入点的共性功能 Before方法之前执行 After方法之后执行
    public void method()//定义通知
    {
        System.out.println(System.currentTimeMillis());
    }
}
