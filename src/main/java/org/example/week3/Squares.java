package org.example.week3;

import static input.InputUtils.doubleInput;

public class Squares {
    public static void main(String[] args) {
        double number = doubleInput("Enter a number and I'll square it up baby");
        square(number);
        //call square method to finish this program out
    }

    // square method takes double argument, squares it, and prints result
    // example of kinda what isn't standard
    // most of the time a method should do ONE thing
    // so either calcs OR print
    private static void square(double n) {
        double sq = n * n;
        System.out.println("The square of " + n + " is " + sq);
    }
}
