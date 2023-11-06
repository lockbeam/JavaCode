package org.example.week3;

import static input.InputUtils.intInput;

public class Count {
    public static void main(String[] args) {

        //printing a list of numbers in order
        int smallNumber = intInput("Enter a small number");
        int largeNumber = intInput("Enter a large number");

        System.out.println("Counting from " + smallNumber + " to " + largeNumber);
        count(smallNumber, largeNumber);
    }

    public static void count(int min, int max) {
        //example of a method that doesn't return anything to main method
        for(int i = min; i <= max ; i++) {
            System.out.println(i);
        }
    }

}
