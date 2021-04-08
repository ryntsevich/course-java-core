package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class RectangleTest {
    public static void main(String[] args) {
        Point firstPoint = new Point(2, 9);
        Point secondPoint = new Point(12, 8);
        Rectangle firstRectangle = new Rectangle(firstPoint, secondPoint);
        System.out.println(firstPoint.getX() + "," + firstPoint.getY());
        System.out.println(secondPoint.getX() + "," + secondPoint.getY());
        firstPoint.setY(5);
        System.out.println(firstPoint.getY());
        System.out.println(firstRectangle.getArea());
        System.out.println(firstRectangle.getPerimeter());

    }
}
