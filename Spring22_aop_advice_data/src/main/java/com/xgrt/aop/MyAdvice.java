package com.xgrt.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.xgrt.dao.BookDao.findName(..))")
    private void pt() {
    }


    @Before("pt()")
    public void before(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice……");
    }

//    @After("pt()")
    public void after(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after advice……");
    }

    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) {
        System.out.println("around before advice……");
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        args[0]=666;//可以处理传过来的参数
        //表示对原始操作的调用（必须要有）
        //pjp.proceed();//原始操作可能有异常，直接抛出异常
        Object ret;//标准写法
        try {
            ret = pjp.proceed(args);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        System.out.println("around after advice……");
        return ret;
    }


    @AfterReturning(value = "pt()",returning = "ret")//正常结束才会运行
    public void afterReturning(Object ret)//JoinPoint与其他同时存在时，JoinPoint必须在第一个
    //returning与形参对应
    {
        System.out.println("afterReturning advice……"+ret);
    }

    @AfterThrowing(value="pt()",throwing = "thr")
    public void afterThrowing(Throwable thr) {
        System.out.println("afterThrowing advice……"+thr);
    }
}
