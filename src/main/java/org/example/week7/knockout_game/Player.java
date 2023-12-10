package org.example.week7.knockout_game;

public class Player {

    private String name;
    private boolean knockedOut;
    private int knockoutNumber;

    public Player(String name) {
        this.name = name;
        this.knockedOut = false;
    }

    //getters and setters below

    public String playTurn(DiceCup diceCup) {
        int score = diceCup.rollAll();
        if (playerKnockedOut(score)) {
            knockedOut = true;
        }

        String resultTemplate = "Player %s rolled a total of %d and %s knocked out. " +
                " (Your knockout number was %d";

        String knockedOutOrNot = "was not";
        if (knockedOut) {
            knockedOutOrNot = "was";
        }
        String result = String.format(resultTemplate, name, score, knockedOutOrNot , knockoutNumber);

        return result;
    }

    public boolean playerKnockedOut(int score) {
        if (score == knockoutNumber) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isKnockedOut() {
        return knockedOut;
    }

    public void setKnockedOut(boolean knockedOut) {
        this.knockedOut = knockedOut;
    }

    public int getKnockoutNumber() {
        return knockoutNumber;
    }

    public void setKnockoutNumber(int knockoutNumber) {
        this.knockoutNumber = knockoutNumber;
    }
}
