package springframework.spring6DIdemo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class ProdEnvironment implements OperatingEnvironmentService {

    @Override
    public String chooseEnvironment() {
        return "datasource from prod";
    }
}
