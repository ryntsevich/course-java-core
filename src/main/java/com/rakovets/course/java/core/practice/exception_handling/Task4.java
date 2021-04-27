package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.CustomExceptionForTask4;

public class Task4 {
    public double divideNumber(int value, int number) {
        if (number == 0) {
            throw new CustomExceptionForTask4("Деление на ноль невозможно!");
        }
        return ((double) value) / number;
    }
}
