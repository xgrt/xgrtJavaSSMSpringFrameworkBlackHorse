package com.xgrt;

import com.xgrt.config.SpringConfig;
import com.xgrt.service.ResourceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourceService resourceService = ctx.getBean(ResourceService.class);
        boolean flag = resourceService.openURL("http://pan.baodu.com/xgrt", "123456");
        System.out.println(flag);
    }
}
