package com.xgrt.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DataAop {
    @Pointcut("execution(boolean com.xgrt.service.*Service.*(..))")
    private void servicePt(){}

    @Around("DataAop.servicePt()")
    public Object trimStr(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        //对原始参数的每一个参数进行操作
        for (int i=0;i<args.length;i++)
        {
            //判断是不是字符串
            if (args[i].getClass().equals(String.class))
            {
                //取出数据，trim()操作后，一定要更新数据
                args[i] = args[i].toString().trim();
            }
        }

        return pjp.proceed(args);
    }
}
