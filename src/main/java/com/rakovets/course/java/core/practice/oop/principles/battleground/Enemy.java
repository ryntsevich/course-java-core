package com.rakovets.course.java.core.practice.oop.principles.battleground;

public abstract class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public abstract void attackHero(Hero man);

    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
