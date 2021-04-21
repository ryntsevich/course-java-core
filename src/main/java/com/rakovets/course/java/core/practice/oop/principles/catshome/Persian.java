package com.rakovets.course.java.core.practice.oop.principles.catshome;

public class Persian extends Cat {
    private final double UP_HAPPINESS = 15.0;
    private final double DOWN_HAPPINESS = -15.0;

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

    @Override
    public void mew(Person user) {
        user.changeHappiness(DOWN_HAPPINESS);
    }

    @Override
    public void purr(Person user) {
        user.changeHappiness(UP_HAPPINESS);
    }
}
