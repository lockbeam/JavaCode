package org.example.week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadNumberFromText {
    public static void main(String[] args) throws IOException {

        List<Integer> numbers = new ArrayList<>();
        String filename = "numbers.txt";

        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String line = reader.readLine();

        while (line != null) {
            //ignore anything that isn't an integer
            try {
                int number = Integer.parseInt(line);
                numbers.add(number);
            } catch (NumberFormatException e) { //this below exception is looking for a number formatting exception
                //have to give all exceptions a name - in this case 'e' which is a common exception name
                //important to have the below so you recognize IF and WHERE a problem is happening
                System.out.println(line + "is not an integer, ignoring line");
            }
            line = reader.readLine(); // need this to read next line in the text
        }

        System.out.println(numbers);

    }

}
