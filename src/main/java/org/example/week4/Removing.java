package org.example.week4;

import java.util.ArrayList;
import java.util.List;

public class Removing {
    public static void main(String[] args) {

        List<String> classnames = new ArrayList<>();
        classnames.add("Programming Logic");
        classnames.add("Web Client Server");
        classnames.add("Project Management");
        classnames.add("Info Tech Concepts");

        System.out.println(classnames);

        //remove by value
        classnames.remove("Project Management"); // object
        System.out.println(classnames);

        //remove by position
        classnames.remove(0); // primative
        System.out.println(classnames);

        //removing something that isn't there won't give any sort of success message
        //we can create a boolean to double check if something was removed

        boolean checkIfRemoved = classnames.remove("Real Class");
        System.out.println(classnames + "" + checkIfRemoved); //false

        //add a value to a specific index in range
        classnames.set(1, "Shoe Repair");
        System.out.println(classnames);

        //checking if list contains a specific value
        if (classnames.contains("Shoe Repair")) {
            System.out.println("The list does contain Shoe Repair");
        } else {
            System.out.println("No Shoe Repair in the list");
        }

        //size method tells you how many objects are in the list

        System.out.println(classnames.size()); //2

        //clear list
        classnames.clear();
        System.out.println(classnames);
        System.out.println(classnames.size()); //0
        System.out.println(classnames.isEmpty()); //true


        //removing a specific int value

    List<Integer> classCodes = new ArrayList<>();
        classCodes.add(1234);
        classCodes.add(5678);
        classCodes.add(1111);
        classCodes.add(1010);

        System.out.println(classCodes);
        classCodes.remove( Integer.valueOf(5678)); //remove specific int value
        System.out.println(classCodes);



    }
}
