package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class Atm {
    private int numberBanknotes100;
    private int numberBanknotes50;
    private int numberBanknotes20;
    private String[] array = new String[0];

    public Atm(int numberBanknotes100, int numberBanknotes50, int numberBanknotes20) {
        this.numberBanknotes100 = numberBanknotes100;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes20 = numberBanknotes20;
    }

    public void addBanknotes100(int number) {
        numberBanknotes100 += number;
    }

    public void addBanknotes50(int number) {
        numberBanknotes50 += number;
    }

    public void addBanknotes20(int number) {
        numberBanknotes20 += number;
    }

    public boolean isPossibleIssue(int amount) {
        boolean isPossible = false;
        if (amount <= getAmount(numberBanknotes100, numberBanknotes50, numberBanknotes20)) {
            for (int i = 0; i <= this.numberBanknotes100; i++) {
                for (int j = 0; j <= this.numberBanknotes50; j++) {
                    for (int k = 0; k <= this.numberBanknotes20; k++) {
                        if (i * 100 + j * 50 + k * 20 == amount) {
                            isPossible = true;
                            break;
                        }
                    }
                }
            }
        }
        return isPossible;
    }

    public String getOptionsCombinationBanknotes(int amount) {
        String optionsCombination = "";
        String combination = "";
        int option = 0;
        if (isPossibleIssue(amount)) {
            for (int i = 0; i <= this.numberBanknotes100; i++) {
                for (int j = 0; j <= this.numberBanknotes50; j++) {
                    for (int k = 0; k <= this.numberBanknotes20; k++) {
                        if (i * 100 + j * 50 + k * 20 == amount) {
                            combination = ++option + ": " + i + " - 100; " + j + " - 50; " + k + " - 20;\n";
                            optionsCombination += combination;
                            array = addToNewArray(array, combination);
                        }
                    }
                }
            }
        }
        return optionsCombination;
    }

    public String getCash(int option) {
        String result = "";
        if (array.length == 0) {
            result = "You need to enter the amount!";
        } else if (option > array.length) {
            result = "Incorrect option!";
        } else {
            for (int i = 0; i <= array.length; i++) {
                if (option == i + 1) {
                    result = array[i];
                }
            }
        }
        return result;
    }

    private int getAmount(int numberBanknotes100, int numberBanknotes50, int numberBanknotes20) {
        return 100 * numberBanknotes100 + 50 * numberBanknotes50 + 20 * numberBanknotes20;
    }

    private String[] addToNewArray(String[] old, String item) {
        int newSize = old.length + 1;
        String[] result = new String[newSize];
        for (int i = 0; i < old.length; i++) {
            result[i] = old[i];
        }
        result[newSize - 1] = item;
        return result;
    }
}
