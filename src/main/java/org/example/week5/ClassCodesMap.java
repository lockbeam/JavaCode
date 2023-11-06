package org.example.week5;

import java.util.HashMap;
import java.util.Map;

public class ClassCodesMap {

    public static void main(String[] args) {

        Map<Integer, String> classCodes = new HashMap<>();
        classCodes.put(2545, "Java");
        classCodes.put(1425, "Datacom");
        classCodes.put(2560, "Web");

        //loop that prints in form of ITEC 2545 Java
        for (Integer classCode: classCodes.keySet()) {
            String className = classCodes.get(classCode);
            System.out.println("ITEC " + classCode + " " + className);
        }

        //size of hashmap - how many classes are in the list?
        System.out.println("There are " + classCodes.size() + " classes on the list");
        //could also save as new int
        // int numberOfClasses = classCodes.size();

        // setting example to show how to use a loop to search for input
        int searchCode = 2417; //Android

        if (classCodes.containsKey(searchCode)) {
            System.out.println("This class is found! The class name is " +
                    classCodes.get(searchCode));
        } else {
            System.out.println(searchCode + " not found");
        }

        // setting another example to search with null
        int searchCode2 = 2545;

        //so pulling name of class right away
        String className = classCodes.get(searchCode2);
        // and if the code doesn't exist name should be null so:
        if (className == null) {
            System.out.println(searchCode2 + " not found");
        } else {
            System.out.println("This class is found! The class name is " +
                    className);
        }

    }
}
