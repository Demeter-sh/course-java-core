package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Point {
private int x;
private int y;

    {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        if (x > 0) {
            this.x = x;
        }
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        if (y > 0) {
            this.y = y;
        }
    }

    int getDistance(Point point) {
        return (int) Math.sqrt(Math.pow(this.x - point.getX(), 2) + Math.pow(this.y - point.getY(), 2));
}
}
