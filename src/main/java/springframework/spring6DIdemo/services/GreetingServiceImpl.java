package springframework.spring6DIdemo.services;

import org.springframework.stereotype.Service;

@Service//it means  to be a Spring managed component
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service!";
    }
}
