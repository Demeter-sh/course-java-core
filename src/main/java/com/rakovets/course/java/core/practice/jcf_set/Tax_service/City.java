package com.rakovets.course.java.core.practice.jcf_set.Tax_service;

public enum City {
    CITY1("Minsk"),
    CITY2("Mogilev"),
    CITY3("Brest"),
    CITY4("Vitebsk");
    private String city;

    City(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "City{" +
                "city='" + city + '\'' +
                '}';
    }
}
