package com.rakovets.course.java.core.practice.jcf_map;

import com.rakovets.course.java.core.practice.jcf_map.Garage.*;

import java.util.List;
import java.util.Map;

public class GarageDemo {
    public static void main(String[] args) {
        Car bmw = new BMW("BMW 7", "Black", 2023, "BMW7 12345");
        Mercedes mercedesCLK63Black = new Mercedes("CLK63Black", "Silver", 2009, "MercedesCKL63BLack123456");
        Volkswagen vwPassat = new Volkswagen("Passat", "White", 2003, "PassatN1D4");

        System.out.println(bmw);

        Garage garage = new Garage();
        garage.parkCar(Country.GERMANY, bmw);
        garage.parkCar(Country.GERMANY, mercedesCLK63Black);
        garage.parkCar(Country.GERMANY, vwPassat);

        for (Map.Entry<Country, List<Car>> mp: garage.getGarageMap().entrySet()) {
            System.out.println("mp " + mp);
        }
    }
}
