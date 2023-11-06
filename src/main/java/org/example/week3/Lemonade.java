package org.example.week3;

import static input.InputUtils.*;

public class Lemonade {
    public static void main(String[] args) {
        //make a general main method that asks for a product
        // and then calls a new method to gather specifics for that product
        // which returns a total profit figure to the main method
        String productName = stringInput("What is the name of the product sold? ");
        double productProfit = calculateProfitForProduct(productName);
        System.out.println("Total profit for " + productName + " is " + productProfit);

    }


    // creating a general method for whatever product is being sold
    public static double calculateProfitForProduct(String productName) {
        double suppliesCost = doubleInput("How much did you spend on " + productName + " supplies?");
        double salesPrice = doubleInput("How much did you sell one " + productName + " for?");
        int numberSold = intInput("How many " + productName + " did you sell?");

        //and calculate product
        double totalProfit = ( numberSold * salesPrice ) - suppliesCost;
        return totalProfit;
    }
}
