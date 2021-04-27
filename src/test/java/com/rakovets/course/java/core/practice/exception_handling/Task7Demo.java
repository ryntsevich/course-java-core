package com.rakovets.course.java.core.practice.exception_handling;

public class Task7Demo {
    public static void main(String[] args) {
        try {
            Task7.getException();
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Program completed");
        }
    }
}
