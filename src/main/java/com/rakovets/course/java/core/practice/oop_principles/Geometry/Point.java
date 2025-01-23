package com.rakovets.course.java.core.practice.oop_principles.Geometry;

public class Point {
    private int xCoordinate;
    private int yCoordinate;
    private int zCoordinate;

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public int getZCoordinate() {
        return zCoordinate;
    }

    public void setZCoordinate(int zCoordinate) {
        this.zCoordinate = zCoordinate;
    }

    public Point(int xCoordinate, int yCoordinate, int zCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.zCoordinate = zCoordinate;
    }
}
