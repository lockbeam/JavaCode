package org.example.week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CodeStyleCheck {
    public static void main(String[] args) throws IOException {

        String filename = "ReadNumberFromText.java";
        int maxLineLength = 100;

        // try with resource handling
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            boolean linesTooLong = false;
            int numberOfLinesTooLong = 0;
            String line = reader.readLine();
            int lineCounter = 1;
            while (line != null) {
                // System.out.println(line);
                if (line.length() > maxLineLength) {
                    System.out.println("The line " + lineCounter + " is too long");
                    System.out.println(line);
                    linesTooLong = true;
                    numberOfLinesTooLong++;
                }
                lineCounter ++;
                line = reader.readLine();
            }
            if (linesTooLong) {
                System.out.println("There were " + numberOfLinesTooLong + " that were too long");
            } else {
                System.out.println("There were no lines that were too long");
            }

        } catch (IOException e) {
            System.out.println("Error reading file " + filename + " because " + e);
        }

    }
}
