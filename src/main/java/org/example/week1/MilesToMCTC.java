package org.example.week1;

import static input.InputUtils.positiveDoubleInput;

public class MilesToMCTC {
    public static void main(String[] args) {
        double miles = positiveDoubleInput("How many miles from your house to MCTC?");
        double km = miles * 1.6;
        System.out.println("You live " + km + " kilometers from school");

        if (miles > 20) {
            System.out.println("You live more than 20 miles away.");
        } else if (miles == 20) {
            System.out.println("You live exactly 20 miles away");
        } else {
            System.out.println("You live less than 20 miles away.");
        }
    }
}
