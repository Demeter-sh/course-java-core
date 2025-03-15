package com.rakovets.course.java.core.practice.jcf_set.TexService;

import java.util.HashSet;
import java.util.Set;

public class TaxPayer {
    private final String ID;
    private Set<FineTypes> setOfFines;

    public String getID() {
        return ID;
    }

    public Set<FineTypes> getSetOfFines() {
        return setOfFines;
    }

    public TaxPayer(String id) {
        this.ID = id;
        this.setOfFines = new HashSet<>();
    }

    public void addFine(FineTypes fineType) {
        setOfFines.add(fineType);
    }

    @Override
    public String toString() {
        return "TaxPayer{" +
                "ID='" + ID + '\'' +
                ", setOfFines=" + setOfFines +
                '}';
    }
}
