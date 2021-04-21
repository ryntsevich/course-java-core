package com.rakovets.course.java.core.practice.oop.principles.battleground;

public class Mag extends Hero {
    private final int DAMAGE = 70;

    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy angryMan) {
        angryMan.takeDamage(DAMAGE);
    }
}
