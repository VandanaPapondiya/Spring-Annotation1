package com.SpringAnnotation2;

import com.SpringAnnotation2.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String ar[]){
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        UserService u=context.getBean(UserService.class);
        u.performAction();
    }
}
