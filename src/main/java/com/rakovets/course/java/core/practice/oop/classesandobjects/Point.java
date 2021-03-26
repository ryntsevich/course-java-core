package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getDistance(Point newPoint) {
        return Math.sqrt(Math.pow((newPoint.getX() - x), 2) + Math.pow((newPoint.getY() - y), 2));
    }
}
