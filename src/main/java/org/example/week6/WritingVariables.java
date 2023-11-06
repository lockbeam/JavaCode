package org.example.week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingVariables {
    public static void main(String[] args) throws IOException {

        int classCode = 2454;
        double averageEnrollment = 22.16; //avg number of students
        String className = "Java";

        FileWriter writer = new FileWriter("java.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write(classCode + "\n");
        bufferedWriter.write(averageEnrollment + "\n");
        bufferedWriter.write(className + "\n");

        bufferedWriter.close();

    }
}
