package org.example.week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static input.InputUtils.*;

public class GuestList {
    public static void main(String[] args) {

        //general random number generator
//        Random rnd = new Random();
//        int randomNumber = rnd.nextInt(10); //0-9
//        int randomNumberBtwn1and10 = rnd.nextInt(10) + 1; // 1-10
//        System.out.println(randomNumber + "" + randomNumberBtwn1and10);

        List<String> guestList = new ArrayList<>();

        while (true) {
            String name = stringInput("Enter the name of the guest or enter to quit");

            if (name.isEmpty()) {
                break; // break while loop so if no input we move on because there's no more guests to add
            }
            if (containsIgnoresCase(guestList, name)) {
                System.out.println("You have already added " + name);
            } else {
                System.out.println("Adding " + name + " to list.");
                guestList.add(name);
            }
        }

        Collections.sort(guestList); //sort alphabetically
        printGuestNames(guestList);

        // remove guests from list if needed

        while (yesNoInput("Do you want to remove any guests?")) {
            System.out.println("Here's the current guest list: ");
            printGuestNames(guestList);

            //break loop if guest loop becomes empty
            if (guestList.isEmpty()) {
                System.out.println("There are no more guests to remove");
                break;
            }

            int index = positiveIntInput("Enter the number of the guest you'd like to remove");
            index--; // cause humans like to start counting from 1
            // so the above makes sure if the user selects the guest in index slot 2 is actually displayed list number 3

            if (index < guestList.size()) { //validation to make sure removing guest from size of list
                String removedGuest = guestList.remove(index);
                System.out.println("Removed guest " + removedGuest);
            } else {
                System.out.println("Error - please enter a valid guest number");
            }

        }

        printGuestNames(guestList);
        System.out.println("The number of guests in the list is " + guestList.size());

        selectPrizeWinner(guestList);
    }

    public static void selectPrizeWinner(List<String> guests) {

        // if guestList is empty don't pick a random number
        if (guests.isEmpty()) {
            System.out.println("Warning - no guests in list to win prize");
            return;
        }

        Random rnd = new Random();
        int randomGuestIndex = rnd.nextInt(guests.size()); //0-guest length total size minus one

        //select guest at random
        String prizeWinner = guests.get(randomGuestIndex);
        System.out.println("Guest number " + (randomGuestIndex+1) + " (" + prizeWinner + ")" + " wins a prize!");


    }


    public static void printGuestNames(List<String> guests) {

        System.out.println("Your guest list is: \n");

        // validating guest list contains objects
        if (guests.isEmpty()) {
            System.out.println("There are no guests in the list.");
        } else {
            for (int i = 0 ; i < guests.size() ; i++) {
                System.out.println((i + 1) + ": " + guests.get(i));
            }
        }
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

