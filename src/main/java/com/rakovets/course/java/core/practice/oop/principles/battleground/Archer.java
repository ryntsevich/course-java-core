package com.rakovets.course.java.core.practice.oop.principles.battleground;

public class Archer extends Hero{
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Attack Archer!");
    }
}
