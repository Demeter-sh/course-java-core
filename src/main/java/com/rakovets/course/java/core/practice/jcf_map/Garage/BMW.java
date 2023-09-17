package com.rakovets.course.java.core.practice.jcf_map.Garage;

public class BMW extends Car {
    private final String brand = "BMW";

    public BMW(String model, String color, int yearOfManufacture, String registrationNumber) {
        super(color, yearOfManufacture, registrationNumber);
        setBrand(brand);
        setModel(model);
    }
}
