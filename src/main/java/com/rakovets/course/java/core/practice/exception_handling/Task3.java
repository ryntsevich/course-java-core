package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.CustomForTask3Exception;

public class Task3 {
    private int health;

    public void takeDamage(int damage, int number) throws CustomForTask3Exception {
        for (int i = 0; i <= number; i++) {
            if (health < 0) {
                throw new CustomForTask3Exception("Error. Health < 0", health);
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
