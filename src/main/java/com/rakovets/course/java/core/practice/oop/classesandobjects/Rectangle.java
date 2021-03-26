package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class Rectangle {
    private Point firstPoint;
    private Point secondPoint;

    public Rectangle(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public int getPerimeter() {
        return (secondPoint.getX() - firstPoint.getX()) * 2 + (secondPoint.getY() - firstPoint.getY()) * 2;
    }

    public int getArea() {
        return (secondPoint.getX() - firstPoint.getX()) * (secondPoint.getY() - firstPoint.getY());
    }
}
