package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class PointTest {
    public static void main(String[] args) {
        Point firstPoint = new Point(12,3);
        System.out.println(firstPoint.getX() + "," + firstPoint.getY());
        Point secondPoint = new Point(16,7);
        System.out.println(secondPoint.getX() + "," + secondPoint.getY());
        secondPoint.setX(46);
        secondPoint.setY(65);
        System.out.println(secondPoint.getX() + "," + secondPoint.getY());
        System.out.println(firstPoint.getDistance(secondPoint));
    }
}
