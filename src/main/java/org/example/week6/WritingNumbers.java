package org.example.week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingNumbers {
    public static void main(String[] args) throws IOException {

        int data1 = 4;
        int data2 = 104;
        int data3 = 1004;

        double number = 15.00;

        FileWriter writer = new FileWriter("numbers.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        // using .write with int values the program will interpret the data as a unicode value
//        bufferedWriter.write(data1);
//        bufferedWriter.write(data2);
//        bufferedWriter.write(data3);

        // write expects some sort of string value so we could do this:
            bufferedWriter.write(data1 + "\n");
            bufferedWriter.write(data2 + "\n");
            bufferedWriter.write(data3 + "\n");

            //or:
            bufferedWriter.write(Integer.toString(data1));

        // same with doubles, need to add a string
        bufferedWriter.write(number + "\n");

        bufferedWriter.close();

    }
}
