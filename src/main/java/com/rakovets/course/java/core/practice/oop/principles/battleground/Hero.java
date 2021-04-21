package com.rakovets.course.java.core.practice.oop.principles.battleground;

public abstract class Hero {
    private int DAMAGE = 10;
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy();
}
