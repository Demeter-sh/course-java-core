package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Point {
    private int x;
    private int y;

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

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point point1, Point point2) {
        double distance = Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2);
        return Math.sqrt(distance);
    }
}
