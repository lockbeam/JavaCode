package org.example.week4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.positiveDoubleInput;

public class Speeds {
    public static void main(String[] args) {
        List<Double> speeds = new ArrayList<>();

        int totalHours = 12;

        for (int hour = 0 ; hour < totalHours; hour++) {
            double speed = positiveDoubleInput("Enter the internet speed for hour " + hour);
            speeds.add(speed);
        }

        System.out.println("All the speeds are: ");

        for (int hour = 0 ; hour < speeds.size(); hour++) {
            double speed = speeds.get(hour);
            System.out.printf("Hour: %d Speed%.2f\n", hour, speed);
        }

        //counting the number of times speed was zero
        int zeroCount = 0;

        for (double speed: speeds) {
            if (speed == 0) {
                zeroCount++;
            }
        }

        System.out.println("Number of times speed was 0 (no connection): " + zeroCount);

        // remove all zeros
        while (speeds.contains(0.0)) {
            speeds.remove(0.0);

        }

        //average speed not counting zeros
        double total = 0;
        for (double speed: speeds) {
            total = total + speed;
        }

        double averageSpeed = total / speeds.size();

        System.out.println("Your average speed was "+ averageSpeed);

    }
}
