package com.rakovets.course.java.core.practice.exception_handling;

public class Task2 {
    public void throwArrayIndexOutOfBoundsException(int size, int number) {
        int[] array = new int[size];
        array[number] = number;
    }
}
