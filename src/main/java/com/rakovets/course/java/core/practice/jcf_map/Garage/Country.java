package com.rakovets.course.java.core.practice.jcf_map.Garage;

public enum Country {
    GERMANY("Germany"),
    SWEDEN("Sweden");

    String country;

    Country(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Country{"+ country
                + '}';
    }
}
