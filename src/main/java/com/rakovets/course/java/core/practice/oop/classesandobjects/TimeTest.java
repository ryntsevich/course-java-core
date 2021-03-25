package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class TimeTest {
    public static void main(String[] args) {
        Time timer = new Time(6, 56, 6);
        System.out.println(timer.getHours() + ":" + timer.getMinutes() + ":" + timer.getSeconds());
        System.out.println(timer.getTotalSeconds());
        timer.setMinutes(4);
        System.out.println(timer.getMinutes());
        timer.setHours(90);
        timer.setSeconds(45);
        System.out.println(timer.getHours() + ":" + timer.getMinutes() + ":" + timer.getSeconds());

        Time secondTimer = new Time(24966);
        System.out.println(secondTimer.getSeconds());
        System.out.println(secondTimer.getHours() + ":" + secondTimer.getMinutes() + ":" + secondTimer.getSeconds());
    }
}
