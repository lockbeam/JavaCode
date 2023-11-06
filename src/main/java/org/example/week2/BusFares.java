package org.example.week2;

import static input.InputUtils.doubleInput;

public class BusFares {
    public static void main(String[] args) {

        int numberOfDays = 7;
        double total = 0;

        for (int day = 1; day <= numberOfDays ; day++) {
            double amountSpent = doubleInput("What did you spend on bus fare on day " + day);
            total = total + amountSpent;
        }
        System.out.println("Total for the week = $" + total);
        System.out.printf("Total for the week = $%.2f", total);
    }
}
