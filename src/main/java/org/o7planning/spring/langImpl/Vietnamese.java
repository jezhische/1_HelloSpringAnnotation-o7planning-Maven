package org.o7planning.spring.langImpl;

import org.o7planning.spring.lang.Language;

public class Vietnamese implements Language {
    public String getGreeting() {
        return "Xin Chao";
    }

    public String getBye() {
        return "Tam Biet";
    }
}
