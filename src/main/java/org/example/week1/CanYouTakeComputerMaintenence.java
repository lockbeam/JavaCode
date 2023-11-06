package org.example.week1;

import static input.InputUtils.yesNoInput;

public class CanYouTakeComputerMaintenence {
    public static void main(String[] args) {

        System.out.println("This program will check if you meet the pre-requisites for taking ITEC 1300 Microcomputer Systems Maintenance");
        System.out.println("Please answer the following questions");

        boolean hasTakenITConcepts = yesNoInput("Have you taken ITEC 1100 Info Tech Concepts?");
        boolean hasTakenITSkills = yesNoInput("Have you taken ITEC 1100 Info Tech Skills?");
        boolean hasTakenWindows = yesNoInput("Have you taken ITEC 1250 Windows Operating Systems?");

        // Use an AND operator in the condition to check for all pre-requisites
        if (hasTakenITConcepts && hasTakenWindows && hasTakenITSkills) {
            System.out.println("You meet the pre-requisites. You may take ITEC 1310 Microcomputer Systems Maintenance");
        } else {
            System.out.println("You do not meet the pre-requisites yet. You need to complete all three pre-requisite classes");
        }



    }
}
