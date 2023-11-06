package org.example.week5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static input.InputUtils.positiveIntInput;

public class MinnesotaRoadTrip {

    public static void main(String[] args) {

        Map<String, Integer> distances = new HashMap<>();
        distances.put("Duluth", 154);
        distances.put("Stillwater", 26);
        distances.put("Brainerd", 127);
        distances.put("Ely", 245);
        distances.put("Red Wing", 54);

        // if i wanted a static Map
        Map<String, Integer> distancesStatic = Map.of(
                "Duluth", 154,
                "Stillwater", 26,
                "Brainerd", 127,
                "Ely", 245,
                "Red Wing", 54
        );

        System.out.println(distances);

        int maxDrivingDistance = positiveIntInput("Enter the max distance you want to drive in miles");

        //trying Lists and Arrays
        List<String> citiesInRange = new ArrayList<>();

        for (String city: distances.keySet()) {
            int distance = distances.get(city);
            if (distance <= maxDrivingDistance) {
                //System.out.println(city + " is " + distance + " miles away.");
                //Add to list instead
                citiesInRange.add(city);
            }
        }

        if (citiesInRange.isEmpty()) {
            System.out.println("Try Saint Paul???");
        } else {
            System.out.println("Here are the cities you can drive to " + citiesInRange.size());
            for (String city: citiesInRange) {
                System.out.println(city);
            }
        }

    }
}
