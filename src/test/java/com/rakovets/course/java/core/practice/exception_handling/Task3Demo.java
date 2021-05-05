package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.CustomForTask3Exception;

public class Task3Demo {
    public static void main(String[] args) {
        Task3 task = new Task3(12);
        try {
            task.takeDamage(6, 3);
        } catch (CustomForTask3Exception exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}
