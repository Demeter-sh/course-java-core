package com.rakovets.course.java.core.practice.jcf_map.Garage;

import java.util.Objects;

public abstract class Car {
    private String brand;
    private String model;
    private String color;
    private int yearOfManufacture;
    private String registrationNumber;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Car(String color, int yearOfManufacture, String registrationNumber) {
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{"
                + "brand - " + brand
                + ", model - " + model
                + ", color - " + color
                + ", yearOfManufacture - " + yearOfManufacture
                + ", registrationNumber - " + registrationNumber
                +'}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, yearOfManufacture, registrationNumber);
    }

    @Override
    public boolean equals(Object a) {
        if(this.equals(a)) {
            return true;
        } if (a == null || this.getClass() != a.getClass()) {
            return false;
        }
        Car car = (Car) a;
        return Double.compare(yearOfManufacture, car.getYearOfManufacture()) == 0 && Objects.equals(brand, car.getBrand()) && Objects.equals(model, car.getModel())  && Objects.equals(color, car.getColor()) && Objects.equals(registrationNumber, car.getRegistrationNumber());
        }
}
