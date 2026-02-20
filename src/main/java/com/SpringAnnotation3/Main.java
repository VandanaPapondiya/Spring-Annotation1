package com.SpringAnnotation3;

import com.SpringAnnotation3.AppConfig;
import com.SpringAnnotation2.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String ar[]){

        System.out.println("Starting Spring Application Context...");
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
         System.out.println("Retrieving Lifecycle Bean");
         LifecycleBean lifecycleBean = context.getBean(LifecycleBean.class);
           lifecycleBean.performTask();

            System.out.println("Closing Spring Application Context");
    }
}
