package org.example.week3;

import static input.InputUtils.doubleInput;

public class MPG {
    public static void main(String[] args) {
        double miles = doubleInput("Enter number of miles driven: ");
        double gas = doubleInput("Enter gallons of gas used: ");

        //calls milesToGallon method
        double mpg = milesPerGallon(miles, gas);
        System.out.println("THe MPG for this journey is " + mpg + " miles per gallon.");
    }

    // milesPerGallon method takes two double inputs from main method does calcs and returns a single double
    public static double milesPerGallon(double miles, double gallonsOfGas) {
        double mpg = miles / gallonsOfGas;
        return mpg;
    }
}
