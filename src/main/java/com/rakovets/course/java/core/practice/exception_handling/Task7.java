package com.rakovets.course.java.core.practice.exception_handling;

public class Task7 {
    public static void getException() throws Exception {
        int value = (int) (Math.random() * 2);
        if (value == 1) {
            throw new NullPointerException("NullPointerException");
        } else {
            throw new ClassNotFoundException("ClassNotFoundException");
        }
    }
}
