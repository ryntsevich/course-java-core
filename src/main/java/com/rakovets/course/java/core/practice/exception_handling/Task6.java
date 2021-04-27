package com.rakovets.course.java.core.practice.exception_handling;

public class Task6 {
    public static void getException() {
        int value = (int) (Math.random() * 3);
        if (value == 1) {
            throw new NullPointerException("NullPointerException");
        } else if (value == 2) {
            throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
        } else {
            throw new NumberFormatException("NumberFormatException");
        }
    }
}
