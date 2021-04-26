package com.rakovets.course.java.core.practice.exception_handling;

public class Task1Demo {
    public static void main(String[] args) {
        Task1 task = new Task1();
        try {
            task.getToUpperCaseForNull();
        } catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
