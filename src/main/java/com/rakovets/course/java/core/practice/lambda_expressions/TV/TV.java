package com.rakovets.course.java.core.practice.lambda_expressions.TV;

import java.util.Objects;

public class TV {
    private String manufacturer;
    private String modelName;
    private int releaseYear;
    private double diagonal;
    private int price;

    public TV(String manufacturer, String modelName, int releaseYear, double diagonal, int price) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.releaseYear = releaseYear;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return releaseYear == tv.releaseYear && Double.compare(diagonal, tv.diagonal) == 0 && price == tv.price && Objects.equals(manufacturer, tv.manufacturer) && Objects.equals(modelName, tv.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, modelName, releaseYear, diagonal, price);
    }

    @Override
    public String toString() {
        return "TV{" +
                "manufacturer='" + manufacturer + '\'' +
                ", modelName='" + modelName + '\'' +
                ", releaseYear=" + releaseYear +
                ", diagonal=" + diagonal +
                ", price=" + price +
                '}';
    }
}
