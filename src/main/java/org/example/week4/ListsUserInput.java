package org.example.week4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class ListsUserInput {
    public static void main(String[] args) {

        List<String> todoList = new ArrayList<>();

        while (true) {
            String data = stringInput("Type a task you need to do or press enter to quit;");
            if (data.length() == 0) { //so if the user did not make an input so the list length is zero then..
                // alt if method
                // if (data.isEmpty()) {
                break; //end the program of collecting to do tasks and display below message
            }
            if (containsIgnoresCase(todoList, data)) {// a new method to check case size when searching for dup entries
                //if (todoList.contains(data)) { //checking for dups
                System.out.println("You already added that");
            } else {
                todoList.add(data);
            }
        }

            System.out.println("Thank you, here are all of your tasks you entered");

            for (String input : todoList) {
                System.out.println(input);
            }

            System.out.println("You have " + todoList.size() + " tasks to do");

        }


        public static boolean containsIgnoresCase (List < String > list, String data){
            for (String item : list) {
                if (item.equalsIgnoreCase(data)) {
                    return true;
                }
            }
            return false;
        }

}
