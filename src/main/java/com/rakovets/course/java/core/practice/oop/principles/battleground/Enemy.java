package com.rakovets.course.java.core.practice.oop.principles.battleground;

public abstract class Enemy implements Mortal {
    protected int health;

    public Enemy(int health) {
        this.health = health;
    }

    public abstract void attackHero(Hero man);

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
