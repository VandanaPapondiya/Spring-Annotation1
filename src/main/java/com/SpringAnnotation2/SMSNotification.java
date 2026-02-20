package com.SpringAnnotation2;

import org.springframework.stereotype.Component;

@Component
public class SMSNotification implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("Notification sent via SMS");
    }
}
