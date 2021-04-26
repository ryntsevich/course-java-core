package com.rakovets.course.java.core.practice.exception_handling;

public class CustomExceptionForTask3 extends Exception {
    private int health;

    public int getHealth() {
        return health;
    }

    public CustomExceptionForTask3(String message, int health) {
        super(message);
        this.health = health;
    }
}
