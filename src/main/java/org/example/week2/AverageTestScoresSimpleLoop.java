package org.example.week2;

import static input.InputUtils.doubleInput;

public class AverageTestScoresSimpleLoop {
    public static void main(String[] args) {

        // calculating the average of 5 test scores

        int numberOfTests = 5;
        double testScore;
        double testScoreSum = 0.0;
        double testScoreAverage;

        for (int test = 1 ; test <= numberOfTests ; test++) {
            testScore = doubleInput("Enter test score #" + test);
            testScoreSum = testScoreSum + testScore;
        }

        testScoreAverage = testScoreSum / numberOfTests;
        System.out.println("Average score = " + testScoreAverage);
    }
}
