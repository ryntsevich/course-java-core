package com.rakovets.course.java.core.practice.exception_handling.exception;

public class CustomForTask3Exception extends Exception {
    private int health;

    public int getHealth() {
        return health;
    }

    public CustomForTask3Exception(String message, int health) {
        super(message);
        this.health = health;
    }
}
