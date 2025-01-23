package com.rakovets.course.java.core.practice.oop_principles.Geometry;

public class Line implements Distance {
    Point a;
    Point b;
    double distance;

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double getDistance() {
        distance = Math.pow(a.getXCoordinate() - b.getXCoordinate(), 2) +
                Math.pow(a.getYCoordinate() - b.getYCoordinate(), 2) +
                Math.pow(a.getZCoordinate() - b.getZCoordinate(), 2);
        distance = Math.sqrt(distance);
        return distance;
    }
}
