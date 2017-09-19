package org.o7planning.spring.config;

import org.o7planning.spring.lang.Language;
import org.o7planning.spring.langImpl.English;
import org.o7planning.spring.langImpl.Vietnamese;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({/*"org/o7planning/spring/service", "org/o7planning/spring/repository",*/ "org/o7planning/spring/bean"})
public class AppConfiguration {
    @Bean(name ="languageV")
    public Language getLanguage() {
        return new Vietnamese();
    }
        @Bean(name ="languageE")
    public Language getLanguageE() {
        return new English();
    }

}
