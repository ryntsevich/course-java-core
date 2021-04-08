package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class AtmTest {
    public static void main(String[] args) {
        Atm banknotesInATM = new Atm(2, 3, 4);
        System.out.println(banknotesInATM.isPossibleIssue(290));
        System.out.println(banknotesInATM.getOptionsCombinationBanknotes(150));
        System.out.println(banknotesInATM.getCash(2));
    }
}
