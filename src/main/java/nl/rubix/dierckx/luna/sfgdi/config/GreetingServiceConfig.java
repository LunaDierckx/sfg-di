package nl.rubix.dierckx.luna.sfgdi.config;

import nl.rubix.dierckx.luna.sfgdi.services.ConstructorGreetingService;
import nl.rubix.dierckx.luna.sfgdi.services.PropertyGreetingService;
import nl.rubix.dierckx.luna.sfgdi.services.SetterGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {
    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyGreetingService propertyGreetingService() {
        return new PropertyGreetingService();
    }

    @Bean
    SetterGreetingService setterGreetingService() {
        return new SetterGreetingService();
    }
}
