package org.example.week2;

import java.util.Arrays;

import static input.InputUtils.stringInput;

public class LoopGetDataForArray {
    public static void main(String[] args) {


        String[] textbooks = new String[5];

        // assign variables to each slot through userinput

        for (int number = 0; number < textbooks.length; number++) {
            String bookName = stringInput("Please enter the name of textbook");

            textbooks[number] = bookName;
        }
        System.out.println("Here is the full book list:");
        System.out.println(Arrays.toString(textbooks));
    }
}
