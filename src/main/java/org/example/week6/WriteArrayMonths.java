package org.example.week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteArrayMonths {
    public static void main(String[] args) throws IOException {

        String[] months = {"Jan", "Feb", "March"};

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("months.txt"));

        for (String month: months) {
            bufferedWriter.write(month);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

    }

}
