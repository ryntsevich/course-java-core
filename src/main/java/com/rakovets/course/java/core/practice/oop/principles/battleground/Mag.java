package com.rakovets.course.java.core.practice.oop.principles.battleground;

public class Mag extends Hero{
    public Mag(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Attack Mag!");
    }
}
