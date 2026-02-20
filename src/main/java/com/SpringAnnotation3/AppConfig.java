package com.SpringAnnotation3;

import com.SpringAnnotation2.NotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.SpringAnnotation3",
        "com.SpringAnnotation2"
})
public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public LifecycleBean lifecycleBean(NotificationService notificationService){
        return new LifecycleBean(notificationService);
    }
}
