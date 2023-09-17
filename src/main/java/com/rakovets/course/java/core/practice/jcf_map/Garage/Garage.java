package com.rakovets.course.java.core.practice.jcf_map.Garage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Garage {
    List<Car> bmwList = new ArrayList<>();
    List<Car> mersedesList = new ArrayList<>();
    List<Car> volkswagenList = new ArrayList<>();
    List<Car> volvoList = new ArrayList<>();
    private Map<Country, List<Car>> garageMap = new HashMap<>();

    public Map<Country, List<Car>> getGarageMap() {
        return garageMap;
    }

    public void parkCar(Country country, Car car) {
        List<Car> carList = new ArrayList<>(List.of(car));
        if(!garageMap.containsKey(country)) {
            garageMap.put(country, carList);
        } else garageMap.get(country).add(car);
    }
}
