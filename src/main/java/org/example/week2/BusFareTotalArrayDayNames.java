package org.example.week2;

import static input.InputUtils.doubleInput;

public class BusFareTotalArrayDayNames {

        public static void main(String[] args) {

            String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", };

            double total = 0;

            for (int day = 0; day < dayNames.length ; day++) {
                String dayName = dayNames[day];
                double dayExpense = doubleInput("What did you spend on bus fare on " + dayName);
                total = total + dayExpense;
            }
            System.out.println("Total for the week = $" + total);
            System.out.printf("Total for the week = $%.2f", total);
        }
}
