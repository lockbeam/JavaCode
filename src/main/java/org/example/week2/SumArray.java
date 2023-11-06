package org.example.week2;

public class SumArray {
    public static void main(String[] args) {

        double numbers[] = new double[3];

        numbers[0] = 345.11234;
        numbers[1] = -123.321;
        numbers[2] = 0.0000000000000000001;

        // set a starting point:
        double sum = 0.0;

        for (int x = 0 ; x < numbers.length ; x++) {
            sum = sum + numbers[x];
        }
        System.out.println("Sum of numbers in array is " + sum);
    }
}
