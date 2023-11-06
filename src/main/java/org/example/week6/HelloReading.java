package org.example.week6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class HelloReading {

    public static void main(String[] args) {

        // FileReader reader = new FileReader("hello.txt");
        // BufferedReader bufferedReader = new BufferedReader(reader);

        BufferedReader bufferedReader = null;

        try {

            // more concise version
            bufferedReader = new BufferedReader((new FileReader("hello.txt")));

            // BufferedReader is going to work with the file reader and gather together a line of
            // characters, collect that line into a string, and then provide the string to this program

            //read lines one at a time

//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());

            //hello.txt has eight lines of code including two that are blank newlines
            // the above will print the first six lines from the txt

//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine()); // this one will print null

            // same thing but with a loop
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }


        }catch (IOException e ) {
            System.out.println("Sorry, file not found. " + e); //only runs if there's a problem
        } finally { // finally blocks run whether or not there was an exception
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                }
                catch (IOException e) {
                    System.out.println("Error closing the file" + e);
                }
            }
        }
    }

}
