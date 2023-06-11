package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class ATM {
    int numberBanknotes20;
    int numberBanknotes50;
    int numberBanknotes100;
    static int amountOfMoney;
    static int option1;
    static int option2;
    static int option3;
    static int amount;

    ATM(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
        amountOfMoney = numberBanknotes20 * 20 + numberBanknotes50 * 50 + numberBanknotes100 * 100;
    }

    public boolean isPossibleIssue (int amount) {
        return amountOfMoney > amount;
    }

    public String getOptionsCombinationBanknotes(int amount) {
        ATM.amount = amount;
        int banknotes20 = 20;
        int banknotes50 = 50;
        int banknotes100 = 100;
        StringBuilder optionsCombinationBanknotes = new StringBuilder();
        if (isPossibleIssue(amount)) {
            if (numberBanknotes20 > 0 && amountOfMoney % this.numberBanknotes20 == 0 && banknotes20 * numberBanknotes20 == amount) {
                int quantityOfBanknotes = amount / banknotes20;
                optionsCombinationBanknotes.append("Option1 - ").append(amount).append("$ could be cashed in ").append(quantityOfBanknotes).append(" 20$ banknotes\n");
                option1 = 1;
            } else {
                option1 = 0;
            }

            if (numberBanknotes50 > 0 && amountOfMoney % this.numberBanknotes50 == 0 && banknotes50 * numberBanknotes50 == amount) {
                int quantityOfBanknotes = amount / banknotes50;
                optionsCombinationBanknotes.append("Option2 - ").append(amount).append("$ could be cashed in ").append(quantityOfBanknotes).append(" 50$ banknotes\n");
                option2 = 1;
            } else {
                option2 = 0;
            }
            if (banknotes20 * numberBanknotes20 == amount) {
                if (numberBanknotes100 > 0 && amountOfMoney % this.numberBanknotes100 == 0) {
                    int quantityOfBanknotes = amount / banknotes100;
                    optionsCombinationBanknotes.append("Option3 - ").append(amount).append("$ could be cashed in ").append(quantityOfBanknotes).append(" 100$ banknotes");
                }
                option3 = 1;
            } else {
                option3 = 0;
            }
        }
        return optionsCombinationBanknotes.toString();
    }

        public int getCash (int optionReturn) {
            if (numberBanknotes20 > 0 && optionReturn == 1 && option1 == 1) {
                amountOfMoney -= amount;
                numberBanknotes20 -= amount / 20;
            }

            if (numberBanknotes50 > 0 && optionReturn == 2 && option1 == 1) {
                amountOfMoney -= amount;
                numberBanknotes50 -= amount / 50;
            }

            if (numberBanknotes100 > 0 && optionReturn == 3 && option1 == 1) {
                numberBanknotes100 -= (amount / 100);
                amountOfMoney -= amount;
            }

            return amount;
    }
}
