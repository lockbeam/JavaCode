package org.example.week1;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class BloodDonor {
    public static void main(String[] args) {

        // Testing for two conditions with AND - the && operator

        System.out.println("What is your weight?");
        double weight = doubleInput();

        System.out.println("How old are you?");
        int age = intInput();

        if (weight >= 110 && age >= 17) {
            System.out.println("You are eligible to be a blood donor");
        } else {
            System.out.println("Sorry, you are not eligible :(");
                if (weight < 110) {
                    System.out.println("You do not weigh enough, you must weigh at least 110 lbs");
                }
                if (age < 17) {
                    System.out.println("You are not old enough. You must be at least 17 years old");
                }
        }
    }
}
