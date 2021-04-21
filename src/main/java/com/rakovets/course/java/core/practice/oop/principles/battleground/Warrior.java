package com.rakovets.course.java.core.practice.oop.principles.battleground;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Attack Warrior!");
    }

}
