package org.o7planning.spring;

import org.o7planning.spring.bean.MyComponent;
import org.o7planning.spring.bean.MyRepository;
import org.o7planning.spring.config.AppConfiguration;
import org.o7planning.spring.lang.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;
import java.util.Map;
import java.util.Properties;

public class MainProgram {
//    @Resource
//    private Environment env;
//
//    @Value("${English}")
//    private String english;
//
//    @Autowired
//    private static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer;

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        Language language = (Language) context.getBean("languageV");
        System.out.println("-------------------------------------");
        System.out.println(language.getGreeting());

        System.out.println("-------------------------------------");
        MyRepository myRepository = (MyRepository) context.getBean("myRepository");
        System.out.println(myRepository.getAppName());
        System.out.println(myRepository.getSystemDateTime());

        System.out.println("-------------------------------------");
        MyComponent myComponent = (MyComponent) context.getBean("myComponent");
        myComponent.showAppInfo();

        System.out.println("-------------------------------------");

//        Properties properties = new Properties();
//        System.out.println(properties.getProperty("English"));

//        new MainProgram().env.getRequiredProperty("English");

//        Map map = System.getenv();
//        map.forEach((key, value) -> System.out.println(key + ": " + value));

//        System.out.println(propertySourcesPlaceholderConfigurer.getAppliedPropertySources().get("English")); //NullPointerException

//        System.out.println(env.getRequiredProperty("English")); // NullPointerException

//        System.out.println(new MainProgram().english);

        Language languageE = (Language) context.getBean("languageE");
        System.out.println("-------------------------------------");
        System.out.println(languageE.getGreeting());
        System.out.println(languageE.getName());
        languageE.setName("hru");
        System.out.println(languageE.getName());
    }
}
