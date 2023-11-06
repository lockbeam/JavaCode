package org.example.week3;

public class Marathon {
    public static void main(String[] args) {

        double currentDistance = 1;
        double targetDistance = 26.2;
        double percentIncrease = 1.10;

        // need to run 10% further every week un until 26.2

        int week = 1;

        while (currentDistance < targetDistance) {
            System.out.println(week + " " + currentDistance);
            currentDistance = currentDistance * percentIncrease;
            week++;
        }

        //while loop won't actually print when currentDistance is finally greater than target distance
        //so need to print bookend calc:
        System.out.println(week + " " + currentDistance);
        // 36 weeks
    }

}
