package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.CustomForTask5Exception;

public class Task5 {
    public String getTrim(String str) throws CustomForTask5Exception {
        try {
            str.trim();
        } catch (NullPointerException exception) {
            throw new CustomForTask5Exception(exception.getMessage());
        }
        return str.trim();
    }
}
