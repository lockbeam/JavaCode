package org.example.week3;

import java.util.Arrays;

public class MakeArrayUpperCase {
    public static void main(String[] args) {

        String[] sponsors = {"ikea", "at&t", "cvs", "3m"};
        makeArrayUppercase(sponsors);
        System.out.println(Arrays.toString(sponsors));
    }

    public static void makeArrayUppercase(String[] array) {
        for (int x = 0 ; x < array.length; x++) {
            array[x] = array[x].toUpperCase();
        }
    }
}
