package com.SpringAnnotation2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class EMAILNotification implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("Notification sent via Email");
    }
}
