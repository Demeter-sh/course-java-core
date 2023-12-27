package com.rakovets.course.java.core.practice.lambda_expressions.Project_TV;

public class Televisor {
    private String manufacturer;
    private String model;
    private int year;
    private int diagonal;
    private int price;

    public Televisor(String manufacturer, String model, int year, int diagonal, int price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Televisor {manufacturer: " + manufacturer
                            + ", model: " + model
                            + ", year: " + year
                            + ", diagonal: " + diagonal
                            + ", price: " + price;
    }
}
