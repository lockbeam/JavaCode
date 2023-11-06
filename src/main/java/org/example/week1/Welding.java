package org.example.week1;

import static input.InputUtils.yesNoInput;

public class Welding {
    public static void main(String[] args) {
        boolean cottonClothes = yesNoInput("Are you wearing cotton clothes?");
        boolean woolClothes = yesNoInput("Are you wearing wool clothes?");
        boolean closedToeShoes = yesNoInput("Are you wearing closed toe shoes?");

        if ( (cottonClothes || woolClothes) && closedToeShoes) {
            System.out.println("You are dressed safely.");
        } else {
            System.out.println("You must wear cotton or wool clothes and closed toe shoes.");
        }


    }
}
