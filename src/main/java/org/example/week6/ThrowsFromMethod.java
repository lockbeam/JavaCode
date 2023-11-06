package org.example.week6;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ThrowsFromMethod {
    public static void main(String[] args) {
        String filename = "not_exists.txt";

        try {
            List<String> data = readFromFile(filename);
            System.out.println(data);
        } catch (FileNotFoundException fnfe) {
            //general did not find file with that name
            System.out.println("The file " + filename + " was not found. Fix and try again");
        } catch (IOException ioe) {
            //out of disk space, permission error, file moved while reading etc
            System.out.println("Could not read from file " + filename);
        }
    }

    private static List<String> readFromFile(String filename) throws IOException {
        //throw IOException instead of try and catch because the name of the file isn't really in control of this method
        // send it back to main to deal with
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        List<String> lines = new ArrayList<>();
        String line = bufferedReader.readLine();
        while (line != null) {
            lines.add(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        return lines;
    }
}
