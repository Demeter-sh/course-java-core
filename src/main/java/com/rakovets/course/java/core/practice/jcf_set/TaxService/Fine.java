package com.rakovets.course.java.core.practice.jcf_set.TaxService;

import java.util.HashSet;
import java.util.Set;

public enum Fine {
    SPEEDING("speeding"),
    DRUNK_DRIVING("drunk driving"),
    NOT_WEARING_SEATBELT("Not wearing seat belt");
    String fine;
    Fine(String fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return fine;
    }

    public static void main(String[] args) {
        Set<Fine> fines = new HashSet<>();
        fines.add(Fine.DRUNK_DRIVING);
        System.out.println(fines);
        System.out.println(fines.add(Fine.SPEEDING));
    }
}
