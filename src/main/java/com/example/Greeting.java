package com.example;
import org.springframework.stereotype.Component;

@Component
public class Greeting implements GreetingService{
    @Override
    public void sayHello() {
        System.out.println("Hello guys!!");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Good bye!!");
    }
}
