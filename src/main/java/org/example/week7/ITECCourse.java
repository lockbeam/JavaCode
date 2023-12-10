package org.example.week7;

import java.util.ArrayList;
import java.util.List;

public class ITECCourse {

    //data - fields - instance variables
    private String name;
    private int code;
    private List<String> students;
    private int maxStudents;

    //alt + insert to have intellij auto generate get and sets
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        //added this bit to auto generated setters and getters for validation
        if (maxStudents < 0) {
            return;
        }
        this.maxStudents = maxStudents;
    }

    //constructor
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents) {
        //setting field name to parameter courseName etc
        name = courseName;
        code = courseCode;
        maxStudents = courseMaxStudents;
        students = new ArrayList<>();
    }

    // create an instance method
    // no public or private because it's an instance method that is part of the class
    public void addStudent(String studentName) {
        //moved above to constructor but leaving as an example
//        if (students == null) {
//            //if students is null create the students list if it didn't already exist
//            students = new ArrayList<>();
//        }

        if (students.size() == maxStudents) {
            System.out.println("Course is full, can't add " + studentName);
        } else {
            students.add(studentName);
        }
    }

    //another method to display data
    public void writeCourseInfo() {
        System.out.println("Course name: " + name);
        System.out.println("Course code: " + code);
        System.out.println("Students enrolled: ");
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students that can enroll in this course is " + maxStudents);
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was successfully unenrolled from " + name);
        } else {
            System.out.println(studentName + " was not found in " + name);
        }
    }

}
