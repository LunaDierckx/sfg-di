package nl.rubix.dierckx.luna.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class I18NEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
