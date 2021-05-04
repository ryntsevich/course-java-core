package com.rakovets.course.java.core.practice.generic_types;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.<Integer>getMax(2, 3, 4));
        System.out.println(Math.<Number>getMax(2.9, -3.4E+38, 11.6F));
    }
}
