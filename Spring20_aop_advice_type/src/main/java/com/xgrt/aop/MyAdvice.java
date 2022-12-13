package com.xgrt.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.xgrt.dao.BookDao.update())")
    private void pt() {
    }

    @Pointcut("execution(int com.xgrt.dao.BookDao.select())")
    private void pt2() {
    }

//    @Before("pt()")
    public void before() {
        System.out.println("before advice……");
    }

//    @After("pt()")
    public void after() {
        System.out.println("after advice……");
    }

    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice……");
        //表示对原始操作的调用（必须要有）
        //pjp.proceed();//原始操作可能有异常，直接抛出异常
        Object ret = pjp.proceed();//标准写法
        System.out.println("around after advice……");
        return ret;
    }

//    @Around("pt2()")
    //只能返回Object对象
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice……");
        //表示对原始操作的调用（必须要有）
        Object ret = pjp.proceed();//有返回值的对应的结果要接收
        System.out.println("around after advice……");
        return ret;
    }

//    @AfterReturning("pt2()")//正常结束才会运行
    public void afterReturning() {
        System.out.println("afterReturning advice……");
    }

    @AfterThrowing("pt2()")
    public void afterThrowing() {
        System.out.println("afterThrowing advice……");
    }
}
