package org.o7planning.spring.langImpl;

import org.o7planning.spring.lang.Language;

public class English implements Language {

    private String name;

    public String getGreeting() {
        return "Hello";
    }

    public String getBye() {
        return "Bye bye";
    }

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
