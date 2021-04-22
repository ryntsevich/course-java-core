package com.rakovets.course.java.core.practice.oop.principles.battleground;

import java.util.Random;

public class Zombie extends Enemy {
    private final int DAMAGE = 20;
    private int startHealth;

    public Zombie(int health) {
        super(health);
        this.startHealth = health;
    }

    @Override
    public void attackHero(Hero man) {
        man.takeDamage(DAMAGE);
    }

    public void superPower() {
        if (this.getHealth() <= 0) {
            Random value = new Random();
            if (value.nextBoolean()) {
                health = startHealth;
            }
        }
    }
}
