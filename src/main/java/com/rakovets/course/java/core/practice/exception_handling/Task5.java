package com.rakovets.course.java.core.practice.exception_handling;

public class Task5 {
    public String getTrim(String str) throws CustomExceptionForTask5 {
        try {
            str.trim();
        } catch (NullPointerException exception) {
            throw new CustomExceptionForTask5(exception.getMessage());
        }
        return str.trim();
    }
}
