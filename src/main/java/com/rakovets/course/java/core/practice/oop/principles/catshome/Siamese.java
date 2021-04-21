package com.rakovets.course.java.core.practice.oop.principles.catshome;

public class Siamese extends Cat {
    private final double UP_HAPPINESS = 20.0;
    private final double DOWN_HAPPINESS = -20.0;
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

    @Override
    public void mew(Person user) {
        user.changeHappiness(DOWN_HAPPINESS);
    }

    @Override
    public void purr(Person user) {
        user.changeHappiness(UP_HAPPINESS);
    }
}