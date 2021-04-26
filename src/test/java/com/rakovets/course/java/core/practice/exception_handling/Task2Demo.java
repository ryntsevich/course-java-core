package com.rakovets.course.java.core.practice.exception_handling;

public class Task2Demo {
    public static void main(String[] args) {
        Task2 task = new Task2();
        try {
            task.throwArrayIndexOutOfBoundsException(5,7);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
