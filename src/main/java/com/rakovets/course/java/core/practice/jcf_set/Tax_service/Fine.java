package com.rakovets.course.java.core.practice.jcf_set.Tax_service;

public enum Fine {
    FINE1("Speeding"),
    FINE2("Leaving the Scene of an Accident"),
    FINE3("Distracted Driving"),
    FINE4("Reckless Driving");
    private String fine;

    Fine(String fine) {
        this.fine = fine;
    }

    public String getFine() {
        return fine;
    }

    @Override
    public String toString() {
        return "Fines {"
                + fine + '\''
                +'}';
    }
}
