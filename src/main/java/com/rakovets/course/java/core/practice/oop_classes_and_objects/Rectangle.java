package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    Point topLeftPoint;
    Point bottomRightPoint;

    Rectangle(Point point1, Point point2) {
        this.topLeftPoint  = point1;
        this.bottomRightPoint = point2;
    }

    public Point getTopLeftPoint() {
        return this.topLeftPoint;
    }

    public void setTopLeftPoint(Point point1) {
        topLeftPoint = point1;
    }

    public Point getBottomRightPoint() {
        return this.bottomRightPoint;
    }

    public void setBottomRightPoint(Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }

    public int getPerimeter() {
        int perimeter = 0;
        if (topLeftPoint.getX() == bottomRightPoint.getX()) {
            perimeter = topLeftPoint.getDistance(bottomRightPoint) + topLeftPoint.getX() *2;
        } else if (getBottomRightPoint().getY() == getTopLeftPoint().getY()) {
            perimeter = topLeftPoint.getDistance(bottomRightPoint) + topLeftPoint.getY() *2;
        }
        else {
            perimeter = (Math.abs(bottomRightPoint.getX() - topLeftPoint.getX()) + Math.abs(bottomRightPoint.getY() - topLeftPoint.getY())) * 2;
        }
        return perimeter;
    }

    public int getArea() {
        int area = 0;
        if (topLeftPoint.getX() == bottomRightPoint.getX()) {
            area = topLeftPoint.getDistance(bottomRightPoint) * topLeftPoint.getX();
        } else if (getBottomRightPoint().getY() == getTopLeftPoint().getY()) {
            area = topLeftPoint.getDistance(bottomRightPoint) * topLeftPoint.getY();
        }
        else {
            area = (Math.abs(bottomRightPoint.getX() - topLeftPoint.getX()) * Math.abs(bottomRightPoint.getY() - topLeftPoint.getY()));
        }
        return area;
    }
}
