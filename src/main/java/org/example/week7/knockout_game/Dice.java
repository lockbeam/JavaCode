package org.example.week7.knockout_game;

import java.util.Random;

public class Dice {

    Random rnd = new Random();

    public int roll() {
        return rnd.nextInt(6) + 1; //range btwn 1 and 6
    }
}
