package nl.rubix.dierckx.luna.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class I18NDutchGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hallo Wereld - NL";
    }
}
