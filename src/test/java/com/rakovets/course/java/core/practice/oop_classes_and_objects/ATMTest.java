package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("ATM test")
public class ATMTest {
    @Test
    @DisplayName("Add number banknotes20")
    void addNumberBanknotes20Test() {
        ATM atm1 = new ATM(0,0,0);
        atm1.addNumberBanknotes20(10);

        Assertions.assertEquals(10, atm1.getNumberBanknotes20());
    }

    @Test
    @DisplayName("Add number banknotes50")
    void addNumberBanknotes50Test() {
        ATM atm1 = new ATM(0,0,0);
        atm1.addNumberBanknotes50(50);

        Assertions.assertEquals(50, atm1.getNumberBanknotes50());
    }

    @Test
    @DisplayName("Add number banknotes100")
    void addNumberBanknotes100Test() {
        ATM atm1 = new ATM(0,0,0);
        atm1.addNumberBanknotes100(100);

        Assertions.assertEquals(100, atm1.getNumberBanknotes100());
    }

    @Test
    @DisplayName("Is possible issue")
    void isPossibleIssueTest() {
        ATM atm1 = new ATM(5,2,1);

        Assertions.assertTrue(atm1.isPossibleIssue(20));
    }

    public static void main(String[] args) {
        ATM atm = new ATM(0,0,3);
        System.out.println(atm.getOptionsCombinationBanknotes(200));
    }
}
