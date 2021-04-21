package com.rakovets.course.java.core.practice.oop.principles.battleground;

public class Warrior extends Hero {
    private final int DAMAGE = 50;

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy angryMan) {
        angryMan.takeDamage(DAMAGE);
    }
}
