package com.rakovets.course.java.core.practice.oop.principles.catshome;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mew-siamese";
    }

    @Override
    public String purr() {
        return "purr-siamese";
    }
}
