package com.rakovets.course.java.core.practice.oop.principles.battleground;

public class Zombie extends Enemy{
    private final int DAMAGE = 20;

    public Zombie(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero man) {
        man.takeDamage(DAMAGE);
    }
}
