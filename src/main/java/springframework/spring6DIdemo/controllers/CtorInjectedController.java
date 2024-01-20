package springframework.spring6DIdemo.controllers;

import org.springframework.stereotype.Controller;
import springframework.spring6DIdemo.services.GreetingService;

@Controller//it also means  to be a Spring managed component
public class CtorInjectedController {
    private final GreetingService greetingService;

    public CtorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
        //Spring needs to create an instance of this
        //so it will execute it and inject a greeting service into the ctor
        //so it tells Spring it needs to create the greeting service first and then inject it into this
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
