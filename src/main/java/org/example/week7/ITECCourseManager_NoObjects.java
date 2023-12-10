package org.example.week7;

//This is an object oriented program : )

public class ITECCourseManager_NoObjects {

    public static void main(String[] args) {
        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);

        //add students
        maintenanceCourse.addStudent("Wanda");
        maintenanceCourse.addStudent("Wbndb");
        maintenanceCourse.addStudent("Wcndc");

        //testing removal method
        maintenanceCourse.removeStudent("Wcndc");
        //and informative message for student not found
        maintenanceCourse.removeStudent("Wondo");


        //see info about the course and who is registered
        maintenanceCourse.writeCourseInfo();

        //same thing different course
        ITECCourse datacomCourse = new ITECCourse("Data Communicaitons", 1425, 30);

        datacomCourse.addStudent("Wdndd");
        datacomCourse.addStudent("Wende");
        datacomCourse.addStudent("Wfndf");

        datacomCourse.writeCourseInfo();

        //third course
        ITECCourse softwareDevelopmentProjects = new ITECCourse("Software Development Projects", 2903, 24);
        softwareDevelopmentProjects.addStudent("Wgndg");
        softwareDevelopmentProjects.addStudent("Whndh");
        softwareDevelopmentProjects.addStudent("Windi");
        softwareDevelopmentProjects.addStudent("Wjndj");

        //display total number of students
        int totalEnrolled = softwareDevelopmentProjects.getNumberOfStudents();
        System.out.println("The software class has " + totalEnrolled + " students");
        System.out.println("The " + softwareDevelopmentProjects.getName() + " class has " + totalEnrolled + " students");
        System.out.println("ITEC " + softwareDevelopmentProjects.getCode() + " " + softwareDevelopmentProjects.getName());

        //change max student number
        //softwareDevelopmentProjects.maxStudents = 30;
        //commenting out above to show changes once private was added to fields
        softwareDevelopmentProjects.setMaxStudents(30);
        softwareDevelopmentProjects.writeCourseInfo();

        //one more to test max students allowed
        ITECCourse smallCourse = new ITECCourse("Fake course", 911, 3);
        smallCourse.addStudent("Wkndk");
        smallCourse.addStudent("Wlndl");
        smallCourse.addStudent("Wmndm");
        //shouldn't be able to add this one:
        smallCourse.addStudent("Wnndn");

        smallCourse.writeCourseInfo();

    }
}
