package org.example.week2;

import static input.InputUtils.positiveIntInput;

public class Stars {
    public static void main(String[] args) {

        //take user input to display a square of x by y made of *
        int size = positiveIntInput("Enter size of square");

        //outer loop prints one row per loop and then repeats
        for (int x=0 ; x < size; x++ ) {

            //nested inner for loop. For each row print a star that many times
            for (int y = 0 ; y < size; y++) {
                //System.out.print NOT sout. This doesn't add a newline at the end of the output
                // so all starts are on the same line
                System.out.print("*");

            }
            // and then move the next line
            System.out.println();

        }
    }
}
