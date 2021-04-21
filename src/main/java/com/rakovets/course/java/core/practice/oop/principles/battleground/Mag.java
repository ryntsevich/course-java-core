package com.rakovets.course.java.core.practice.oop.principles.battleground;

public class Mag extends Hero{
    private int DAMAGE = 70;

    public Mag(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy angryMan) {
        angryMan.takeDamage(DAMAGE);
    }
}
