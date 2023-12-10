package org.example.week7.dates;

import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        // A Date object represents a point in time
        // For example, Wednesday October 27 2024, 3:08pm, CST

        Date now = new Date();
        System.out.println();

        // number of miliseconds since Midnight January 1, 1970, UTC
        System.out.println(now.getTime());
        //number of miliseconds since that date currently

        //store it in a long
        long milliseconds = now.getTime();
        System.out.println(milliseconds);

        Date dateFromTime = new Date(milliseconds);
        //store the date from when getTime was run

        long numberofMilliseconds = 1435753753775L; // L at the end to tell java this is a long value and not an int
        //set a random number
        Date date2015 = new Date(numberofMilliseconds);
        System.out.println(date2015);

        if (date2015.before(now)) {
            System.out.println("2009 is earlier then now");
        }

    }
}
