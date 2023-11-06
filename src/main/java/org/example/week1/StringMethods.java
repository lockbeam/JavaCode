package org.example.week1;

import java.util.Arrays;

import static input.InputUtils.stringInput;

public class StringMethods {
    public static void main(String[] args) {

        // length
        String secretPassword = "kittens";
        int numberOfCharactersInPassword = secretPassword.length();
        System.out.println(numberOfCharactersInPassword);

        if (secretPassword.length() > 12) {
            System.out.println("Longer passwords are more secure - good choice");
        } else {
            System.out.println("Consider using a longer password");
        }

        // lowercase
        // emails are usually lowercase
        String email = "User.Person@SERVER.gov";
        email = email.toLowerCase();
        System.out.println(email);

        // uppercase
        // department codes are usually uppercase
        String classIdentified = "itec 2545";
        classIdentified = classIdentified.toUpperCase();
        System.out.println(classIdentified);

        // ends with
        System.out.println(email.endsWith(".gov")); //true
        System.out.println(email.endsWith(".edu")); //false

        // starts with
        String classCode = stringInput("Please enter a class code");
        System.out.println(classCode.startsWith("ITEC"));
        if (classCode.startsWith("ITEC")) {
            System.out.println("This is an ITEC class");
        } else {
            System.out.println("This is NOT an ITEC class");
        }

        // contains
        // Look for support ticket requests that contain the text "server"
        // case sensitive
        String supportTicketDescription1 = "The server is down";
        String supportTicketDescription2 = "My mouse mat is missing";
        String supportTicketDescription3 = "All the servers need to be rebooted";
        String supportTicketDescription4 = "SERVERS EXPLODED";

        System.out.println(supportTicketDescription1.contains("server")); //true
        System.out.println(supportTicketDescription2.contains("server")); //false
        System.out.println(supportTicketDescription3.contains("server")); //true
        System.out.println(supportTicketDescription3.contains("server")); //false because of case

        String serverProblem = "The SERVER IS DOWN!!!";
        String searchTerm = "server";

        if (serverProblem.toUpperCase().contains(searchTerm.toUpperCase())) {
            System.out.println("Found a server problem");
        } else {
            System.out.println("This is not a server problem");
        }

        // split
        // splits sentence into words (stored in an array)
        String sentence = "IntelliJ is a Java integrated development environment";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        String firstWord = words[0];
        System.out.println(firstWord); //IntelliJ no brackets

        // split on comma identifier
        String javaIDEs = "IntelliJ,Eclipse,NetBeans,Notepad++,VSCode";
        String[] ides = javaIDEs.split(",");
        System.out.println(Arrays.toString(ides));

        //loop
        // prints a loop of the ides one on each line
        for (int x = 0 ; x < ides.length ; x++) {
            System.out.println(ides[x]);
        }

        // split class identifier into department and code
        String javaClass = "ITEC 2545";
        String[] javaClassIdentifierParts = javaClass.split(" ");
        String department = javaClassIdentifierParts[0];
        String code = javaClassIdentifierParts[1];
        System.out.println(department);
        System.out.println(code);

        // trim
        // remove whitespace
        String userAddressInput = "  1503 Hennepin Avenue  ";
        userAddressInput = userAddressInput.trim();
        System.out.println(userAddressInput);

        // format strings
        // printf - no newline - you need to add a /n
        String className = "Java Programming";
        double credits = 6.0;
        int studentsEnrolled = 24;
        String format = "Online";

        // want to print The Java Programming class is 6 credits, delivered Online, and there are 24 students enrolled
        System.out.printf("The %s class is %.1f credits, delivered %s, and there are %d students enrolled\n",
                className, credits, format, studentsEnrolled);








    }
}
