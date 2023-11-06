package org.example.week5;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        //like python dictionary

        Map<String, String> stateAbbreviations = new HashMap<>();

        stateAbbreviations.put("Minnesota", "MN");
        stateAbbreviations.put("Wisconsin", "WI");
        stateAbbreviations.put("Michigan", "MI");

        System.out.println(stateAbbreviations);
        //{Minnesota=MN, Wisconsin=WI, Michigan=MI}

        System.out.println(stateAbbreviations.containsValue("WI"));

        //case sensitive with get method
        System.out.println(stateAbbreviations.get("Minnesota")); // MN
        System.out.println(stateAbbreviations.get("MN")); // null doesn't work the other way around

        System.out.println(stateAbbreviations.get("Iowa")); // null because nothing to return

        String wisconsinAbbreviation = stateAbbreviations.get("Wisconsin");
        System.out.println(wisconsinAbbreviation); //WI

        //looping over hashmap keys
        for (String stateName: stateAbbreviations.keySet()) {
            System.out.println(stateName);
            System.out.println(stateAbbreviations.get(stateName));
        }

        //lopping over values
        for (String abbreviation: stateAbbreviations.values()) {
            System.out.println(abbreviation);
        }

        String searchAbbreviation = "MI";

        for (String stateName: stateAbbreviations.keySet()) {
            System.out.println(stateName);
            String abbreviation = stateAbbreviations.get(stateName);
            if (abbreviation.equals(searchAbbreviation)) {
                System.out.println("Found it! The state for " + searchAbbreviation + " is " + stateName);
            }
        }

        //reversed hashmap with keys and values swapped
        Map<String, String> abbreviationsStateNames = new HashMap<>();

        for (Map.Entry<String, String> entry: stateAbbreviations.entrySet()) {
            String state = entry.getKey();
            String abbreviation = entry.getValue();
            abbreviationsStateNames.put(abbreviation, state);
        }

        System.out.println(stateAbbreviations);
        System.out.println(abbreviationsStateNames);

        // Each key value pair counts as one thing
        System.out.println("There are " + stateAbbreviations.size() + " states listed");

    }
}
