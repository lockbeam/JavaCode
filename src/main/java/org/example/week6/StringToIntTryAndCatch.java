package org.example.week6;

public class StringToIntTryAndCatch {
    public static void main(String[] args) {

        String hopeThisIsANumber = "cat";

        try {
            int number= Integer.parseInt(hopeThisIsANumber);
            System.out.println("The number is " + number); // this line won't be executed because the previous line failed
        } catch (NumberFormatException nameOfException) {
            System.out.println(hopeThisIsANumber + " is not a valid integer string");
        }
    }
}
