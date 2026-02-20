package com.SpringAnnotation3;

import com.SpringAnnotation2.NotificationService;
import org.springframework.stereotype.Component;


public class LifecycleBean {
    NotificationService notificationService;

    public LifecycleBean(NotificationService notificationService){
        System.out.println("Constructor called: dependency Injected");
        this.notificationService = notificationService;
    }

    public void init(){
        System.out.println("Init method called: Bean is going through initialization");
        notificationService.sendNotification();
    }

    public void performTask(){
        System.out.println("Ready for use");
    }

    public void cleanup(){
        System.out.println("cleanup() being called");
    }

}
