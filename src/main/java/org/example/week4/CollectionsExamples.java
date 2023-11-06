package org.example.week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExamples {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("waffle");
        animals.add("Squirrel");
        animals.add("grumpy gus");
        animals.add("miike snow");
        animals.add("miike snow"); //deliberate duplicate


        System.out.println("Original animals list: " + animals);

        Collections.sort(animals); // sort into order - only if type of data is sortable

        System.out.println("Sorted animals list: "+ animals);

        Collections.reverse(animals); //reverse order of list
        System.out.println("In reverse order " + animals);

        Collections.shuffle(animals); //put elements in random order
        System.out.println("Shuffled list: " + animals);

        //display the minimum value = the lowest value = for strings the first letter in the alphabet
        System.out.println("First in the alphabet: " + Collections.min(animals));
        //max value  = the highest value = for Strings the last in the alphabet
        System.out.println("Last in the alphabet: " + Collections.max(animals));

        Collections.fill(animals, "Squishmellow"); // fill the entire ArrayList with Squishmellow
        System.out.println("We replaced every element with Squishmellow so now the list is " + animals);

    }

}
