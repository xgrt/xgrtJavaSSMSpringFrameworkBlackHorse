package com.xgrt.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MyAdvice {
    //匹配业务层的所有方法
    @Pointcut("execution(* com.xgrt.service.*Service.*(..))")
    private void servicePt() {
    }

    @Around("MyAdvice.servicePt()")
    public Object runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();//这次执行的签名信息
        String className = signature.getDeclaringTypeName();//执行的类型
        String methodName = signature.getName();//执行的方法名

        long start = System.currentTimeMillis();

        Object ret =null;
        for (int i = 0; i < 10000; i++) {
            ret = pjp.proceed();
        }

        long end = System.currentTimeMillis();
        System.out.println("万次执行："+className+"."+methodName+"=======>"+(end-start)+"ms");
        return ret;
    }
}
