package org.example.week4;

import java.util.ArrayList;
import java.util.List;

public class ListsPractice {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Name");
        arrayList.add("MCTC");

        for (String s: arrayList) {
            System.out.println(s);
            System.out.println(s.toUpperCase());
            System.out.println(s.length());
        }

        System.out.println(arrayList);
    }
}
