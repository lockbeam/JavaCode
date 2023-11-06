package org.example.week1;

import static input.InputUtils.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String userName = stringInput("Please enter your name: ");
        System.out.println("Welcome, " + userName);

        int howManyClasses = positiveIntInput("How many classes are you taking?");

        String units = "classes";

        if (howManyClasses == 1) {
            units = "class";
        }

        System.out.println(userName + " is taking " + howManyClasses + " " + units + " this semester");

    }
}