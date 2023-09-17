package com.rakovets.course.java.core.practice.jcf_map.Garage;

public class Volkswagen extends Car {
    private final String brand = "Volkswagen";

    public Volkswagen(String model,String color, int yearOfManufacture, String registrationNumber) {
        super(color, yearOfManufacture, registrationNumber);
        setBrand(brand);
        setModel(model);
    }
}
