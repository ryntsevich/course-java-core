package com.rakovets.course.java.core.practice.oop.principles.battleground;

public class Archer extends Hero {
    private final int DAMAGE = 30;

    public Archer(String name, int health) {
        super(name,health);
    }

    @Override
    public void attackEnemy(Enemy angryMan) {
        angryMan.takeDamage(DAMAGE);
    }
}
