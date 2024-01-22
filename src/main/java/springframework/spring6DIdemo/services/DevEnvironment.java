package springframework.spring6DIdemo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class DevEnvironment implements OperatingEnvironmentService {

    @Override
    public String chooseEnvironment() {
        return "datasource from dev";
    }
}
