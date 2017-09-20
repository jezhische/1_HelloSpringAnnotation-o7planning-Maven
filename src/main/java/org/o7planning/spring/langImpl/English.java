package org.o7planning.spring.langImpl;

import org.o7planning.spring.lang.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

public class English implements Language {

    private String name;
    @Value("${engProp}")
    private String engPropName;
//    @Autowired
//    Environment env;
//    private String fromEnv = env.getProperty("${Vietnamese}");

    @Override
    public String getGreeting() {
        return "Hello";
    }

    @Override
    public String getBye() {
        return "Bye bye";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getEngPropName() {
        return engPropName;
    }

//    public String getFromEnv() {
//        return fromEnv;
//    }
}
