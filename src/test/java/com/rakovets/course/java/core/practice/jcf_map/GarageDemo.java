package com.rakovets.course.java.core.practice.jcf_map;

import com.rakovets.course.java.core.practice.jcf_map.Garage.BMW;
import com.rakovets.course.java.core.practice.jcf_map.Garage.Car;
import com.rakovets.course.java.core.practice.jcf_map.Garage.Mercedes;
import com.rakovets.course.java.core.practice.jcf_map.Garage.Volkswagen;

public class GarageDemo {
    public static void main(String[] args) {
        Car bmw = new BMW("BMW 7", "Black", 2023, "BMW7 12345");
        Mercedes mercedesCLK63Black = new Mercedes("CLK63Black", "Silver", 2009, "MercedesCKL63BLack123456");
        Volkswagen vwPassat = new Volkswagen("Passat", "White", 2003, "PassatN1D4");
        System.out.println(bmw);
    }
}
