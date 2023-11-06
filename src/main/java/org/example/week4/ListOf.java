package org.example.week4;

import java.util.List;

public class ListOf {
    public static void main(String[] args) {

        List<String> animals = List.of("Cat", "Bird", "Miike Snow");
        System.out.println(animals);
        // creates a list with the preset values - cannot modify
        // animals.add("Panda"); // will crash system
    }

}
