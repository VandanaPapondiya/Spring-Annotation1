package com.SpringAnnotation2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    private NotificationService notificationService;

/* 1.Solution
    @Autowired
    //There are two implementations of NotificationService and both are managed by Spring,
    // so we need to specify which one to inject. We can do this by using @Qualifier annotation along with @Autowired.
    //@Qualifier annotation is used to specify which bean should be injected when there are multiple beans of the same type.
    //in this case, we have two implementations of NotificationService: EMAILNotification and SMSNotification. We can use @Qualifier to specify which one we want to inject.
    //in double cot we pass the particular bean name that we want to inject and the bean name is the same
    as the class name with the first letter in lowercase. So in this case, the bean name for
    EMAILNotification is "eMAILNotification" and for SMSNotification is "sMSNotification".
    public UserService(@Qualifier("eMAILNotification") NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    */

    //2.Solution
    //Using @Primary annotation: We can also use @Primary annotation on one of the
    // implementations of NotificationService to indicate that it should be the
    // default bean to be injected when there are multiple beans of the same type.
    // So if we annotate one of the implementations with @Primary,
    // then we don't need to use @Qualifier in the constructor.
    @Autowired
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }


    public void performAction() {
        // Perform some action
        notificationService.sendNotification();
    }
}
