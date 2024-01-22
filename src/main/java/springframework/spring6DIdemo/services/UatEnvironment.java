package springframework.spring6DIdemo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class UatEnvironment implements OperatingEnvironmentService {

    @Override
    public String chooseEnvironment() {
        return "datasource from uat";
    }
}
