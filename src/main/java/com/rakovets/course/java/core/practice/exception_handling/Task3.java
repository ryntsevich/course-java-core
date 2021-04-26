package com.rakovets.course.java.core.practice.exception_handling;

public class Task3 {
    private int health;

    public void takeDamage(int damage, int number) throws CustomExceptionForTask3 {
        for (int i = 0; i <= number; i++) {
            if (health < 0) {
                throw new CustomExceptionForTask3("Error. Health < 0", health);
            }
            health -= damage;
        }
    }

    public int getHealth() {
        return health;
    }

    public Task3(int health) {
        this.health = health;
    }
}
