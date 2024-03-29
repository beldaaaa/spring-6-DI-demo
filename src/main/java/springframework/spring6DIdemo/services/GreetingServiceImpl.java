package springframework.spring6DIdemo.services;

import org.springframework.stereotype.Service;

@Service//it means  to be a Spring managed component
//I could also make custom name to service via @Service("blablabla") and then in controller inside class use:
//@Qualifier("blablabla") so it will prioritize this bean
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service!";
    }
}
