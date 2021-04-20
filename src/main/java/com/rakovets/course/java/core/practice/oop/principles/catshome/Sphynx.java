package com.rakovets.course.java.core.practice.oop.principles.catshome;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mew-sphynx";
    }

    @Override
    public String purr() {
        return "purr-sphynx";
    }

}
