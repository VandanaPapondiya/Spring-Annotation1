package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FatherGuest {
    GreetingService greetingService;
    //If more than one constructor is present, then the @Autowired annotation
    // must be used on one of them to indicate which one should be used for
    // dependency injection. If there is only one constructor,
    // the @Autowired annotation can be omitted, and Spring will use
    // that constructor for dependency injection by default.

    //agr ye zero param wala constructor bhi present hai to Spring ko pata nahi chalega ki kaunsa constructor use karna hai
    // to isliye humne @Autowired annotation use kiya hai taaki Spring ko pata chale ki hume
    // GreetingService type ka object chahiye aur usko constructor ke parameter me pass karna hai.
    FatherGuest(){}


        // This constructor will be used for dependency injection by Spring.
        //dekho yaha humne GreetingService type ka variable banaya hai jiska naam
        // greetingService hai aur usko constructor ke parameter me pass kiya hai
        // to jab Spring container is class ko instantiate karega to vo
        // GreetingService type ka object create karega
        // (jo ki Greeting class ka object hoga kyunki Greeting class ne GreetingService
        // interface ko implement kiya hai) aur usko constructor ke parameter me pass karega.
        @Autowired
    FatherGuest(GreetingService greetingService){
        this.greetingService=greetingService;
    }
    public void sayHello(){
        greetingService.sayHello();
    }
     public void sayGoodbye(){
        greetingService.sayGoodbye();
    }
}
