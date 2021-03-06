package org.o7planning.spring.bean;

import org.o7planning.spring.lang.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    @Autowired
    private Language languageV;

    public GreetingService() {}

    public void sayGreeting() {
        System.out.println("Greeting: " + languageV.getGreeting());
    }
}
