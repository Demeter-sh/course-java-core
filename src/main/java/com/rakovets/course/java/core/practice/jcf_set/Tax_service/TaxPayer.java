package com.rakovets.course.java.core.practice.jcf_set.Tax_service;

import java.util.HashSet;
import java.util.Set;

public class TaxPayer {
    private final String id;
    private Set<Fine> fines;

    public TaxPayer(String id, Fine fine) {
        this.id = id;
        fines = new HashSet<>();
        fines.add(fine);
    }

    public TaxPayer(String id) {
        this.id = id;
    }

    public Set<Fine> getFines() {
        return fines;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Tax Payer {"
                + "Id " + id + '\''
                + "fines " + fines + '\''
                + '}';
    }
}
