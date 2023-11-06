package org.example.week6;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class WriteArrayList {
    public static void main(String[] args) throws IOException {

        final String filename = "ITEC_Classes.txt";
        // goal is to write lines to the file like "ITEC 2545 Java"
        List<String> classNames = List.of("Java", "Web", "C#");
        List<Integer> classCodes = List.of(2545, 2560, 2505);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));

//        for (String name: classNames) {
//            bufferedWriter.write(name + "\n");
//        }

        //above would be good for looping through just one list of data
        //below is better when we need to combine

        for (int x = 0 ; x < classNames.size(); x++) {
            String name = classNames.get(x);
            int code = classCodes.get(x);
            bufferedWriter.write("ITEC " + code + " " + name + "\n");
        }

        bufferedWriter.close();

        //read and print txt
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

        //save to noew array list
        List<String> classDescriptions = new ArrayList<>();

        String line = bufferedReader.readLine();

        while (line != null) {
            classDescriptions.add(line);
            line = bufferedReader.readLine();
        }

        System.out.println("End of file reached");
        System.out.println(classDescriptions);

        bufferedReader.close();

    }
}
