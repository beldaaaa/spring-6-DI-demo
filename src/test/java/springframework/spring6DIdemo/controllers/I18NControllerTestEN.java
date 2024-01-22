package springframework.spring6DIdemo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import springframework.spring6DIdemo.controllers.i18n.I18NController;

@ActiveProfiles("EN")
@SpringBootTest
public class I18NControllerTestEN {
    @Autowired
    I18NController i18NController;
    @Test
    void SayHello(){
        System.out.println(i18NController.sayHello());
    }
}
