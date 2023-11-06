package org.example.week1;

import static input.InputUtils.stringInput;

public class CompareStrings {
    public static void main(String[] args) {

        String college = stringInput("Which college do you attend?");

        // careful with string comparisons - double equals signs won't work here
        // need to instead use the .equals method for strings
        // IgnoresCase ignores upper vs lower case
        if (college.equalsIgnoreCase("MCTC")) {
            System.out.println();
        } else {
            System.out.println("Too bad, you should check out MCTC");
        }
    }
}
