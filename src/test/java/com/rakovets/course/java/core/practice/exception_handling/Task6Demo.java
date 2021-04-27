package com.rakovets.course.java.core.practice.exception_handling;

public class Task6Demo {
    public static void main(String[] args) {
        try {
            Task6.getException();
        } catch (NullPointerException | ArrayIndexOutOfBoundsException exception) {
            System.out.println("Same for two");
            System.out.println(exception.getMessage());
        } catch (NumberFormatException exception) {
            System.out.println("Different from others");
            System.out.println(exception.getMessage());
        }
    }
}
