package com.rakovets.course.java.core.practice.oop.principles.catshome;

public class Cat {
    private final double UP_HAPPINESS = 10.0;
    private final double DOWN_HAPPINESS = -10.0;
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
        user.changeHappiness(DOWN_HAPPINESS);
    }

    public void purr(Person user) {
        user.changeHappiness(UP_HAPPINESS);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
