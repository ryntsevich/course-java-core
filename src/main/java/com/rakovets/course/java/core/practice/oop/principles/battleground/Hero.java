package com.rakovets.course.java.core.practice.oop.principles.battleground;

public abstract class Hero implements Mortal {
    private final String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void attackEnemy(Enemy angryMan);

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
