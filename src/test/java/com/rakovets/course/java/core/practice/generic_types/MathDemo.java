package com.rakovets.course.java.core.practice.generic_types;

import java.util.Arrays;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.<Integer>getMax(2, 3, 4));
        System.out.println(Math.<Number>getMax(2.9, -3.4E+38, 11.6F));
        System.out.println(Math.<Number>getMin(9, 5, 6, -1, 8.7));
        System.out.println(Math.getArithmeticMean(new Number[]{2, 2, 2, 3}));
        System.out.println(Math.<Number>getMaxArray(new Number[]{2, 2, 2, 3, -8.9}));
        System.out.println(Math.<Number>getMinArray(new Number[]{2, 2, 2, 3, -8.9}));
        System.out.println(Arrays.toString(Math.sortArray(new Number[]{2, 2, 2, 3, -8.9})));
    }
}
