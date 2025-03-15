package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.TexService.TaxPayer;
import com.rakovets.course.java.core.practice.jcf_set.TexService.TaxService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("TaxService Test")
public class TaxServiceTest {
    TaxService taxService = new TaxService();

    @Test
    @DisplayName("addNewTaxPayer test")
    void addNewTaxPayerTest() {
        TaxPayer taxPayer = new TaxPayer("ID1");

        taxService.addNewTaxPayer("ID1");

        Assertions.assertTrue(taxPayer.getSetOfFines().contains(taxPayer));
    }
}
