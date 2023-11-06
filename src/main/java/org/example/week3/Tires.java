package org.example.week3;

import static input.InputUtils.*;

public class Tires {
    public static void main(String[] args) {

        int numberOfTiresToCompare = positiveIntInput("Enter number of tires to compare: ");
        String[] tireReports = new String[numberOfTiresToCompare];

        for (int t = 0 ; t < numberOfTiresToCompare ; t++) {
            String report = getTireInfo();
 //           System.out.println(report);
            tireReports[t] = report;
        }

        //printReportTable(tireReports);
    }

    public static String getTireInfo() {
        String tireName = stringInput("Enter name of tire");
        double price = doubleInput("Enter price for " + tireName);
        double miles = doubleInput("Enter warranty miles for " + tireName);
        double pricePerMile = price / miles;
        return "The " + tireName + "tire costs $" + pricePerMile + " dollars per thousand miles";
    }
}
