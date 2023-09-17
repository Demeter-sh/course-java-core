package com.rakovets.course.java.core.practice.jcf_map.Garage;

public class Volvo extends Car {
    private final String brand = "Volvo";


    public Volvo(String model, String color, int yearOfManufacture, String registrationNumber) {
        super(color, yearOfManufacture, registrationNumber);
        setBrand(brand);
        setModel(model);
    }
}
