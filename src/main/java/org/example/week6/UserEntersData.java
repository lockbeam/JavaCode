package org.example.week6;

import static input.InputUtils.intInput;

public class UserEntersData {
    public static void main(String[] args) {


//        //classic way to verify user input we've seen so far:
//        int userInput = 0;
//        while (userInput < 1 || userInput > 10) {
//            userInput = intInput("Please enter a number between 1 and 10");
//        }

        //NEW WAY - with do while
        int userInput;

        do {
            userInput = intInput("Please enter a number between 1 and 10");
        } while (userInput < 1 || userInput > 10);


        System.out.println("Thanks, the number you entered is " + userInput);

    }
}
