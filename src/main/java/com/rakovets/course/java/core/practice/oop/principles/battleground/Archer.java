package com.rakovets.course.java.core.practice.oop.principles.battleground;

public class Archer extends Hero {
    private int DAMAGE = 30;

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy angryMan) {
        angryMan.takeDamage(DAMAGE);
    }
}
