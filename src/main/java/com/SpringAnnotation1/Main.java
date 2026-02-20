package com.SpringAnnotation1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String ar[]){
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);

        //but in this type casting is required because getBean method returns an object of type Object and we need to cast it to the type of object that we want
        //why Object type is returned because getBean method is defined in the BeanFactory interface and it returns an object of type Object because it can return any type of object that is defined in the Spring container.
        //in double cot we have to pass the name of the bean that we want to get from the Spring container and in this case the name of the bean is "fatherGuest" because we have defined the FatherGuest
        // class as a component and by default the name of the bean is the same as the class name with the first letter in lowercase.
        //FatherGuest fatherGuest=(FatherGuest) context.getBean("fatherGuest");

        //no need of casting because getBean method is generic and it can return the type of object that we want
        FatherGuest fatherGuest=context.getBean(FatherGuest.class);
        fatherGuest.sayHello();
        fatherGuest.sayGoodbye();
    }
}
