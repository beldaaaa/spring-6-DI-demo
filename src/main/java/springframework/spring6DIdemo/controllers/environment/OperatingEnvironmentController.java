package springframework.spring6DIdemo.controllers.environment;

import org.springframework.stereotype.Controller;
import springframework.spring6DIdemo.services.OperatingEnvironmentService;

@Controller
public class OperatingEnvironmentController {
    private final OperatingEnvironmentService operatingEnvironmentService;

    public OperatingEnvironmentController(OperatingEnvironmentService operatingEnvironmentService) {
        this.operatingEnvironmentService = operatingEnvironmentService;
    }

    public String selectOne() {
        return operatingEnvironmentService.chooseEnvironment();
    }
}
