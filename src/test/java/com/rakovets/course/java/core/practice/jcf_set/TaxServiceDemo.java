package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.Tax_service.Fine;
import com.rakovets.course.java.core.practice.jcf_set.Tax_service.TaxPayer;
import com.rakovets.course.java.core.practice.jcf_set.Tax_service.TaxService;

public class TaxServiceDemo {
    public static void main(String[] args) {
        TaxPayer taxPayer1 = new TaxPayer("1", Fine.FINE1);
        TaxPayer taxPayer2 = new TaxPayer("2", Fine.FINE2);
        TaxPayer taxPayer3 = new TaxPayer("3", Fine.FINE1);
        TaxService taxService = new TaxService();
        taxService.addNewTaxPayer(taxPayer1);
        taxService.addNewTaxPayer(taxPayer2);
        taxService.addNewTaxPayer(taxPayer3);
        //add new fine
        taxService.addNewFine(taxPayer1, Fine.FINE2);

        System.out.println("Size " + taxService.getTaxPayerList().size());

        for (TaxPayer taxPayer: taxService.getTaxPayerList()) {
            System.out.println("Tax Payer add fine - " + taxPayer);
        }

        System.out.println("Find by id 1 - " + taxService.findTaxPayerById("1"));

        System.out.println("findTaxPayerByFineType - Speeding " + taxService.findTaxPayerByFineType(Fine.FINE1 ));

        System.out.println("Tax Payer history taxPayer1" + taxService.findTaxPayer(taxPayer1));
        taxService.removeFine(taxPayer1, Fine.FINE1);

        System.out.println("Find by id 1 - " + taxService.findTaxPayerById("1"));
    }
}
