package org.example.week3;

import java.util.Arrays;

public class CorporateSponsors {
    public static void main(String[] args) {

        //modify an array to make strings uppercase
        String[] sponsors = { "ikea", "at%t", "cvs", "3m"};

        for (int i = 0; i < sponsors.length; i++) {
            String sponsor = sponsors[i];
            // make each sponsor name in sponsors uppercase
            sponsor = sponsor.toUpperCase();
            //and then rewrite sponsors array in same order
            sponsors[i] = sponsor;
            // shorter way instead of lines 12-16:
            // sponsors[i] = sponsors[i].toUpperCase();
        }

        System.out.println(Arrays.toString(sponsors));
    }
}
