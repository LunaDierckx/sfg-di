package nl.rubix.dierckx.luna.sfgdi.controllers;

import nl.rubix.dierckx.luna.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
