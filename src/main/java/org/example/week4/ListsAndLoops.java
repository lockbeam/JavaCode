package org.example.week4;

import java.util.ArrayList;
import java.util.List;

public class ListsAndLoops {
    public static void main(String[] args) {

        List<String> cheeseTypes = new ArrayList<>();
        cheeseTypes.add("Blue");
        cheeseTypes.add("Gorgonzola");
        cheeseTypes.add("Melted");
        cheeseTypes.add("Delicious");

        //classic for loop - easier to pull index if index number is needed
        for (int i = 0 ; i < cheeseTypes.size() ; i++ ) {
            System.out.println(cheeseTypes.get(i) + " is number " + (i + 1) + " on the list");
        }

        //enhanced for loop
        for (String cheese: cheeseTypes) {
            System.out.println(cheese);
        }

        //if modifying a data within the list generally a while loop is the go to for java

        // while cheeseTypes is not empty
        while (!cheeseTypes.isEmpty()) {
            String cheeseName = cheeseTypes.remove(0);
            System.out.println(cheeseName);
        }


    }
}
