package com.rakovets.course.java.core.practice.oop.principles.catshome;

public class Sphynx extends Cat {
    private final double CHANGING_HAPPINESS = 30.0;

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

    @Override
    public void mew(Person user) {
        user.changeHappiness(-CHANGING_HAPPINESS);
    }

    @Override
    public void purr(Person user) {
        user.changeHappiness(CHANGING_HAPPINESS);
    }
}
