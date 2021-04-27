package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.CustomExceptionForTask5;

public class Task5Demo {
    public static void main(String[] args) {
        Task5 task = new Task5();

        try {
            task.getTrim(null);
        } catch (CustomExceptionForTask5 customExceptionForTask5) {
            System.out.println(customExceptionForTask5.getMessage());
            customExceptionForTask5.printStackTrace();
        }
    }
}
