package org.example.week7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static input.InputUtils.*;
import static org.example.week3.Tires.getTireInfo;

public class TireComparison {
    public static void main(String[] args) {
//        will be adding a lot of tires so moving this to a method
//        Tire example = new Tire ("Bridgestone", 50, 10000);
//        System.out.println(example.pricePer10000Miles());
//        System.out.println(example);
//        System.out.println(example.costForSet());

        List<Tire> tireList = new ArrayList<>();

        do {
            Tire tire = getTireInfo();
            tireList.add(tire);
        } while (yesNoInput("Do you have more tires to add and compare?"));

        Collections.sort(tireList);
        printReportTable(tireList);
    }

    private static void printReportTable(List<Tire> tireList) {
        for (Tire tire: tireList) {
            System.out.println(tire);
            System.out.printf("The cost per set of 4 is $%.2f\n", tire.costForSet());
            //System.out.println(tire);
            //System.out.println(tire.costForSet());
        }
    }

    private static Tire getTireInfo() {
        //takes user inputs to establish a new Tire object
        String name = stringInput("Enter name of tire: ");
        double price = positiveDoubleInput("Enter price of " + name + ": ");
        int mileWarranty = positiveIntInput("Enter number of miles warranty: ");

        Tire tire = new Tire(name, price, mileWarranty);
        return tire;
    }
}
