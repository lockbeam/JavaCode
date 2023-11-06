package org.example.week3;

import static input.InputUtils.stringInput;

public class HelloMethods {

    //main method - first code to run
    public static void main(String[] args) {

        String name = stringInput("Please enter your name");
        String greeting = makeGreeting(name);
        System.out.println(greeting);
        // end of main method
    }

    // seperate method below
    // takes a String argument from the main method
    // creates a new String make with "Hello!" and a "!"
    // and returns that as a new greeting String
    public static String makeGreeting(String n) {
        String greeting = "Hello " + n + "!";
        return greeting;
    }

}
