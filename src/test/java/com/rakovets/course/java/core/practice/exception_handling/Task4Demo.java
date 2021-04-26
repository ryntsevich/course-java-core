package com.rakovets.course.java.core.practice.exception_handling;

public class Task4Demo {
    public static void main(String[] args) {
        Task4 task = new Task4();
        try {
            task.divideNumber(4, 0);
        } catch (CustomExceptionForTask4 exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}
