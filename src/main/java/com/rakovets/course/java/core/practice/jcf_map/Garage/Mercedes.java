package com.rakovets.course.java.core.practice.jcf_map.Garage;

public class Mercedes extends Car {
    private final String brand = "Mercedes";


    public Mercedes(String model, String color, int yearOfManufacture, String registrationNumber) {
        super(color, yearOfManufacture, registrationNumber);
        setBrand(brand);
        setModel(model);
    }
}
