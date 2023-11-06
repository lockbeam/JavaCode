package org.example.week2;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

    //example int array
    int[] numbers = new int[5];
    numbers[1] = 54;
    numbers[0] = 1;

    String[] peopleNames = {"Bob", "Bobward", "Bobette", "Bobina", "Bobby"};
    // peopleNames[0] = "Bob"

    int numberOfNames = peopleNames.length;
    System.out.println("There are " + numberOfNames + " people");

    for (int x=0; x<3; x++) {
        System.out.println("A person's name is " + peopleNames[x] );
    }

    System.out.println("Here's all the names in the list");
    for (int x=0; x<peopleNames.length; x++) {
        System.out.println("A person's name is " + peopleNames[x] );
    }

    //how to print contents of array in Java:
        System.out.println(Arrays.toString(peopleNames));


    }
}
