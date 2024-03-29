package springframework.spring6DIdemo.controllers.i18n;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import springframework.spring6DIdemo.services.GreetingService;

@Controller
public class I18NController {
    private final GreetingService greetingService;

    public I18NController(@Qualifier("i18NService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
