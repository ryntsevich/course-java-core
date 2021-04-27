package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.CustomExceptionForTask3;

public class Task3Demo {
    public static void main(String[] args) {
        Task3 task = new Task3(12);
        try {
            task.takeDamage(6, 3);
        } catch (CustomExceptionForTask3 exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}
