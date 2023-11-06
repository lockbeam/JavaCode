package org.example.week2;

import static input.InputUtils.doubleInput;
import static input.InputUtils.yesNoInput;
import java.text.NumberFormat;

public class SalesTaxWhileLoop {
    public static void main(String[] args) {
        //this loop repeats as long as the user wants to do more calcs

        boolean moreCalculations = true;
        double price;
        double salesTax = 1.07;

        while (moreCalculations) {
            price = doubleInput("Type in a price");
            double priceInclTax = price * salesTax;

            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
            String formattedPrice = currencyFormatter.format(priceInclTax);

            System.out.println("The price plus sales tax is " + formattedPrice);

            // ask the user if they want to continue and repeat loop
            moreCalculations = yesNoInput("Do you want to continue?");
        }
        System.out.println("Thanks for using the program - byebye!");
    }
}
