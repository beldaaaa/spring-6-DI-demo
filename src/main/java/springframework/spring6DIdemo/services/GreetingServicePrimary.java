package springframework.spring6DIdemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary//without this annotation I would get test error via bellow:
//expected single matching bean but found 2: greetingServiceImpl,greetingServicePrimary
@Service
public class GreetingServicePrimary implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Primary bean greeting";
    }
}

