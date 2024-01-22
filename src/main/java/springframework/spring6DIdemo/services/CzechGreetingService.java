package springframework.spring6DIdemo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("CS")//also if we want to set this as default profile in case no profile is set as active
//with @Profile("CS", "default") this profile is set as default
@Service("i18NService")
public class CzechGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "doooooobry deeen";
    }
}
