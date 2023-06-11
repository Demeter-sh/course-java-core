package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ATMTest {
    ATM atm = new ATM(1, 1, 1);

       @Test
    void isPossibleIssueTest() {
           boolean actual = atm.isPossibleIssue(20);
           boolean expected = true;
           Assertions.assertEquals(expected, actual);
    }

    @Test
    void getCashTest () {

    }

    public static void main(String[] args) {
        ATM atm = new ATM(1, 2, 2);
        System.out.println("amount of money " + atm.amountOfMoney);
        System.out.println("amount of banknotes20 = " + atm.numberBanknotes20);
        System.out.println("amount of banknotes50 = " + atm.numberBanknotes50);
        System.out.println("amount of banknotes100 = " + atm.numberBanknotes100);
        System.out.println("getOptions - " + atm.getOptionsCombinationBanknotes(100));
    }

}
