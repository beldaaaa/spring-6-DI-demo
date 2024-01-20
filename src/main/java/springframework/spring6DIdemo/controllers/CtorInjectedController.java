package springframework.spring6DIdemo.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import springframework.spring6DIdemo.services.GreetingService;

@Controller//it also means  to be a Spring managed component
public class CtorInjectedController {
    private final GreetingService greetingService;
    //now it will pickup the original instance instead of primary one, also for some reason first letter is lower,
    //not capital: "greeting..."
    public CtorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
        //Spring needs to create an instance of this
        //so it will execute it and inject a greeting service into the ctor
        //so it tells Spring it needs to create the greeting service first and then inject it into this
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
