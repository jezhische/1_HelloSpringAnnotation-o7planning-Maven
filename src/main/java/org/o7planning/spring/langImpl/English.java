package org.o7planning.spring.langImpl;

import org.o7planning.spring.lang.Language;

public class English implements Language {

    public String getGreeting() {
        return "Hello";
    }

    public String getBye() {
        return "Bye bye";
    }
}
