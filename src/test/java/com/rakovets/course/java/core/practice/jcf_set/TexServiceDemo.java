package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.TexService.FineTypes;
import com.rakovets.course.java.core.practice.jcf_set.TexService.TaxPayer;
import com.rakovets.course.java.core.practice.jcf_set.TexService.TaxService;

public class TexServiceDemo {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        taxService.addNewTaxPayer("ID0");
        taxService.addNewTaxPayer("ID123");

        //Test addNewTaxPayer
        for (TaxPayer tp : taxService.getSetTaxPayer()) {
            System.out.println("Test addNewTaxPayer " + tp.getID());
        }

        //Test addFineForTaxPayer
        FineTypes ftDrunkDriving = FineTypes.DRUNK_DRIVING;
        taxService.addFineToTaxPayer("ID123", ftDrunkDriving);
        System.out.println();

        for (TaxPayer tp : taxService.getSetTaxPayer()) {
            System.out.println("Test addFineForTaxPayer " + tp.getID() + " " + tp.getSetOfFines());
        }

        //Test showDataById
        System.out.println("\nTest showDataById");
        taxService.showDataById("ID123");

        //Test showDataFineType
        FineTypes ft = FineTypes.DRUNK_DRIVING;
        System.out.println("\nTest showDataByFineType");
        taxService.showDataByFine(ft);

        //Test showAllTaxPayersInfo
        System.out.println("\nTest showAllTaxPayersInfo");
        taxService.showAllTaxPayersInfo();

        //Test showRemoveFineType
        System.out.println("\n Test showRemoveFineType");
        taxService.removeFineFromTaxPayer("ID123", ftDrunkDriving);
        for (TaxPayer tp : taxService.getSetTaxPayer()) {
            System.out.println(tp);
        }
    }
}
