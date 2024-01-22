package springframework.spring6DIdemo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import springframework.spring6DIdemo.controllers.environment.OperatingEnvironmentController;

@ActiveProfiles({"prod", "EN"})
@SpringBootTest
public class EnvironmentControllerTest {
    @Autowired
    OperatingEnvironmentController operatingEnvironmentController;

    @Test
    void getEnvironment(){
        System.out.println(operatingEnvironmentController.selectOne());
    }
}
