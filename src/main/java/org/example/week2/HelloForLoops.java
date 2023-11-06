package org.example.week2;

public class HelloForLoops {
    public static void main(String[] args) {
        // common loop counter that counts every number from 0 to 9
        for (int x = 0; x < 10; x++) {
            System.out.println(x);
        }

        System.out.println("Here are all the dates in January");
        for (int day = 1 ; day <= 31 ; day++) {
            System.out.println("January " + day);
        }
    }
}
