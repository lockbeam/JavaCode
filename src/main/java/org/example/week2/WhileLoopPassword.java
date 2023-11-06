package org.example.week2;

import static input.InputUtils.stringInput;

public class WhileLoopPassword {
    public static void main(String[] args) {
        String secretPassword = "kittens";
        System.out.println();
        String userPassword = stringInput("What is the password?");

        int maxGuesses = 5;

        // .equals() method to check if two Strings have the EXACT same characters
        // ! on the equals method while user password IS NOT secret password

        while ( ! userPassword.equals(secretPassword ) && maxGuesses > 1) {
            System.out.println("Password incorrect, access denied. Try again.");
            userPassword = stringInput("What is the password?");
            maxGuesses--;
        }

        // if password is correct the while loop does not run so

        if (maxGuesses > 1) {
            System.out.println("Correct, access granted");
        } else {
            System.out.println("Max number of attempts. Account locked.");
            System.exit(0);
        }

    }
}
