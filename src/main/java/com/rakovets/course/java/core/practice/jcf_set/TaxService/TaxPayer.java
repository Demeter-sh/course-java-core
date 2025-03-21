package com.rakovets.course.java.core.practice.jcf_set.TaxService;

import java.util.Set;

public class TaxPayer {
    String id;
    Set<Fine> fines;
    public TaxPayer(String id) {
        this.id = id;
    }
}
