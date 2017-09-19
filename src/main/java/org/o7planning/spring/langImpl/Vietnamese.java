package org.o7planning.spring.langImpl;

import org.o7planning.spring.lang.Language;

public class Vietnamese implements Language {

    private String name;

    public String getGreeting() {
        return "Xin Chao";
    }

    public String getBye() {
        return "Tam Biet";
    }

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
