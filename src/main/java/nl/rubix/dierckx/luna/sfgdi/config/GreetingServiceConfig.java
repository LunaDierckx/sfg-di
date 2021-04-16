package nl.rubix.dierckx.luna.sfgdi.config;

import nl.rubix.dierckx.luna.sfgdi.repositories.EnglishGreetingRepository;
import nl.rubix.dierckx.luna.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import nl.rubix.dierckx.luna.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean("i18nService")
    I18NEnglishGreetingService i18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18NEnglishGreetingService(englishGreetingRepository);
    }

    @Profile({"NL", "default"})
    @Bean("i18nService")
    I18NDutchGreetingService i18nDutchGreetingService() {
        return new I18NDutchGreetingService();
    }

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
