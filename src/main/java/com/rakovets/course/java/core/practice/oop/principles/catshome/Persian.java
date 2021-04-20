package com.rakovets.course.java.core.practice.oop.principles.catshome;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mew-persian";
    }

    @Override
    public String purr() {
        return "purr-persian";
    }
}
