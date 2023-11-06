package org.example.week3;

import static input.InputUtils.intInput;

public class Credit {
    public static void main(String[] args) {
        int required = intInput("How many credits does your program require?");
        int earned = intInput("How many credits have you earned?");
        int needed = howManyCreditsToGraduate(required, earned);

        System.out.println("You need " + needed + " credits to graduate.");
    }

    // takes two int arguments does calcs and returns a single int to main method
    private static int howManyCreditsToGraduate(int creditsNeeded, int creditsEarned) {
        int creditsToGraduate = creditsNeeded - creditsEarned;
        return creditsToGraduate;
    }
}
