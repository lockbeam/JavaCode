package org.example.week6;

import java.io.*;
import java.nio.Buffer;

public class WritingAndReadingName {
    public static void main(String[] args) throws IOException {

        String filename = "data.txt";
        String name = "Student Name";
        String favoriteColor = "mauve";
        int classCode = 2454;

        //write to file
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));
        bufferedWriter.write(name + "\n");
        bufferedWriter.write(favoriteColor);
        bufferedWriter.newLine();
        bufferedWriter.write(classCode + "\n");

        bufferedWriter.close();

        // read the txt
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

        String line = bufferedReader.readLine();

        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();


    }

}
