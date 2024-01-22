package springframework.spring6DIdemo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class QaEnvironment implements OperatingEnvironmentService {

    @Override
    public String chooseEnvironment() {
        return "datasource from qa";
    }
}
