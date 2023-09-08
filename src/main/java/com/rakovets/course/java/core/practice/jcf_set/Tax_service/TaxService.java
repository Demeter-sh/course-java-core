package com.rakovets.course.java.core.practice.jcf_set.Tax_service;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class TaxService {
    private LinkedHashSet<TaxPayer> taxPayerList;

    public TaxService() {
        taxPayerList = new LinkedHashSet<>();
    }

    public Set<TaxPayer> getTaxPayerList() {
        return taxPayerList;
    }

    public void addNewTaxPayer(TaxPayer taxPayer) {
        taxPayerList.add(taxPayer);
    }

    public void addNewFine(TaxPayer taxPayer, Fine fine) {
        taxPayer.getFines().add(fine);
    }

    public Set<TaxPayer> findTaxPayerById(String id) {
        Set<TaxPayer> taxPayersListById = new HashSet<>();
        for (TaxPayer taxPayer : taxPayerList) {
            if(taxPayer.getId().equals(id)) {
                taxPayersListById.add(taxPayer);
                }
            }
            return taxPayersListById;
    }

    public Set<TaxPayer> findTaxPayerByFineType(Fine fine) {
        Set<TaxPayer> listTaxPayerByFineType = new HashSet<>();
        for (TaxPayer taxPayer : taxPayerList) {
            if(taxPayer.getFines().contains(fine)) {
                listTaxPayerByFineType.add(taxPayer);
            }
        }
        return listTaxPayerByFineType;
    }

    public TaxPayer findTaxPayer(TaxPayer taxPayer) {
        TaxPayer taxPayerHistory = null;
        for (TaxPayer tp : taxPayerList) {
            if (tp.equals(taxPayer)) {
                taxPayerHistory = tp;
            }
        }
        return taxPayerHistory;
    }

    public void removeFine(TaxPayer taxPayer, Fine fine) {
        if (taxPayerList.contains(taxPayer)) {
         for (TaxPayer tp : taxPayerList) {
             if (tp.equals(taxPayer)) {
                 tp.getFines().remove(fine);
             }
         }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(taxPayerList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaxService taxService = (TaxService) o;
        return taxPayerList == taxService.taxPayerList;
    }
}
