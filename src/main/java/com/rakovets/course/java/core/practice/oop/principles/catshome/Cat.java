package com.rakovets.course.java.core.practice.oop.principles.catshome;

public class Cat {
    private final double CHANGING_HAPPINESS = 10.0;
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "mew";
    }

    public String purr() {
        return "purr";
    }

    public void mew(Person user) {
        user.changeHappiness(-CHANGING_HAPPINESS);
    }

    public void purr(Person user) {
        user.changeHappiness(CHANGING_HAPPINESS);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
