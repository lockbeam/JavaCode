package org.example.week2;

import java.util.Random;

import static input.InputUtils.stringInput;

public class WhileLoopBreakExampleRandomNumber {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();

        while (true) {
            System.out.println("Would you like a random number?");
            System.out.println("Enter any key for a random number or Q to quit");

            String userInput = stringInput();

            if (userInput.equalsIgnoreCase("Q")) {
                break; //stops the loop
            }

            // if program gets here the loop didn't break so need to generate and display a random number
            int randomNumber = randomNumberGenerator.nextInt();
                //.nextInt() with no argument generates a random number from all possible int values

            System.out.println("Your random number is " + randomNumber);
        }
        System.out.println("Thanks for using this program.");
    }
}
