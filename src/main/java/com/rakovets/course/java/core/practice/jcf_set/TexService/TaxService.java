package com.rakovets.course.java.core.practice.jcf_set.TexService;

import java.util.HashSet;
import java.util.Set;

public class TaxService {
    private Set<TaxPayer> setTaxPayer;

    public Set<TaxPayer> getSetTaxPayer() {
        return setTaxPayer;
    }

    public TaxService () {
        setTaxPayer = new HashSet<>();
    }

    public void addNewTaxPayer(String id) {
        setTaxPayer.add(new TaxPayer(id));
    }

    public void addFineToTaxPayer (String userId, FineTypes fineTypes) {
        for (TaxPayer tp : setTaxPayer) {
            if (tp.getID().equals(userId)) {
               tp.addFine(fineTypes);
            }
        }
    }

    public void showDataById(String id) {
        for (TaxPayer tp : setTaxPayer) {
            if (tp.getID().equals(id)) {
                System.out.println(tp);
            }
        }
    }

    public void showDataByFine(FineTypes ft) {
        for (TaxPayer tp : setTaxPayer) {
            if (tp.getSetOfFines().contains(ft)) {
                System.out.println(tp);
            }
        }
    }

    public void showAllTaxPayersInfo() {
        for (TaxPayer tp : setTaxPayer) {
            System.out.println(tp);
        }
    }

    public void removeFineFromTaxPayer(String taxpayerId, FineTypes ft) {
        for (TaxPayer tp : setTaxPayer) {
            if(tp.getID().equals(taxpayerId)) {
                tp.getSetOfFines().remove(ft);
            }
        }
    }
}
