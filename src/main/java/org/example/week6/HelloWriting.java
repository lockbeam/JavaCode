package org.example.week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWriting {

    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("hello.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("Howdy!\n");
        bufferedWriter.newLine();
        bufferedWriter.write("More Howdy!\n");
        bufferedWriter.write("Last Howdy!\n");

        bufferedWriter.close();

        FileWriter writer2 = new FileWriter("hello.txt", true);
        // using true will append data below to the file instead of overwriting
        BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);
        bufferedWriter2.write("Tawdry!\n");
        bufferedWriter2.newLine();
        bufferedWriter2.write("More Tawdry!\n");
        bufferedWriter2.write("Last Tawdry!\n");

        bufferedWriter2.close();

    }
}
