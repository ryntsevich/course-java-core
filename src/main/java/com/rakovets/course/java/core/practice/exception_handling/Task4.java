package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.CustomTask4RuntimeException;

public class Task4 {
    public double divideNumber(int value, int number) {
        if (number == 0) {
            throw new CustomTask4RuntimeException("Деление на ноль невозможно!");
        }
        return ((double) value) / number;
    }
}
