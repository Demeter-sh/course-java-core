package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.TexService.FineTypes;
import com.rakovets.course.java.core.practice.jcf_set.TexService.TaxPayer;

public class TaxPayerDemo {
    public static void main(String[] args) {
        TaxPayer taxPayer1 = new TaxPayer("ID1");
        FineTypes fineType = FineTypes.DRUNK_DRIVING;

        taxPayer1.addFine(fineType);
        taxPayer1.addFine(fineType);
        for (FineTypes ft :taxPayer1.getSetOfFines()) {
            System.out.println(ft.getFineTypes());
        }
    }
}
