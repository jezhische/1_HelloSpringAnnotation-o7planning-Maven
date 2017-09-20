package org.o7planning.spring.config;

import org.o7planning.spring.lang.Language;
import org.o7planning.spring.langImpl.English;
import org.o7planning.spring.langImpl.Vietnamese;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan({/*"org/o7planning/spring/service", "org/o7planning/spring/repository",*/ "org/o7planning/spring/bean"})
@PropertySource("classpath:application.properties")
public class AppConfiguration {

    @Autowired
    private Environment env;

    @Bean(name = "languageV")
    public Language getLanguage() {
        return new Vietnamese();
    }

//    private final String english = env.getProperty("${English}");
    @Bean(name = "languageE")
    public Language getLanguageE() {
        Language language = new English();
        language.setName(env.getProperty("${English}"/*, "koko"*/));
        return language;
    }

//    http://www.baeldung.com/properties-with-spring#java
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
