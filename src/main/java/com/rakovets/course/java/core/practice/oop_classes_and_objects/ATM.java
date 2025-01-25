package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class ATM {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;
    private final int BANKNOTES20WORTH = 20;
    private final int BANKNOTES50WORTH = 50;
    private final int BANKNOTES100WORTH = 100;

    public int getNumberBanknotes20() {
        return numberBanknotes20;
    }

    public int getNumberBanknotes50() {
        return numberBanknotes50;
    }

    public int getNumberBanknotes100() {
        return numberBanknotes100;
    }

    public ATM(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    public void addNumberBanknotes20(int quantity20) {
        numberBanknotes20 += quantity20;
    }

    public void addNumberBanknotes50(int quantity50) {
        numberBanknotes50 += quantity50;
    }

    public void addNumberBanknotes100(int quantity100) {
        numberBanknotes100 += quantity100;
    }

    public boolean isPossibleIssue(int amount) {

        if(BANKNOTES100WORTH * numberBanknotes100 >= amount && amount % BANKNOTES100WORTH == 0 && amount >= BANKNOTES100WORTH) {
            return true;
        }
        if(BANKNOTES50WORTH * numberBanknotes50 >= amount && amount % BANKNOTES50WORTH == 0 && amount >= BANKNOTES50WORTH) {
            return true;
        }
        return BANKNOTES20WORTH * numberBanknotes20 >= amount && amount % BANKNOTES20WORTH == 0 && amount >= BANKNOTES20WORTH;
    }

    public String getOptionsCombinationBanknotes(int amount) {
        StringBuilder combinationOfBanknotes = new StringBuilder();
        if(BANKNOTES100WORTH * numberBanknotes100 >= amount && amount % BANKNOTES100WORTH == 0 && amount >= BANKNOTES100WORTH) {
            combinationOfBanknotes.append(amount).append(" can be returned by ")
                    .append(amount / BANKNOTES100WORTH).append(" 100banknotes\n");
        }
        if(BANKNOTES50WORTH * numberBanknotes50 >= amount && amount % BANKNOTES50WORTH == 0 && amount >= BANKNOTES50WORTH) {
            combinationOfBanknotes.append(amount).append(" can be returned by ")
                    .append(amount / BANKNOTES50WORTH).append(" 50banknotes\n");
        }
        if(BANKNOTES20WORTH * numberBanknotes20 >= amount && amount % BANKNOTES20WORTH == 0 && amount >= BANKNOTES20WORTH) {
            combinationOfBanknotes.append(amount).append(" can be returned by ")
                    .append(amount / BANKNOTES20WORTH).append(" 20banknotes");
        }
        return combinationOfBanknotes.toString();
    }
}
