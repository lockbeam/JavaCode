package org.example.week6;

import java.util.List;

import static input.InputUtils.stringInput;

public class UserEntersData_WindowsVersion {
    public static void main(String[] args) {

        // Only XP, 7, 8, and 10 are acceptable

        List<String> windowsVersion = List.of("XP", "7", "8", "10");
        String windowsVersionsString = String.join(", ", windowsVersion);

        String version = stringInput("Enter your version of Windows from these choices: " + windowsVersionsString.toUpperCase());

        while (!windowsVersion.contains(version)) {
            version = stringInput("Not a recognized version. " +
                     "Enter your version of Windows from these choices: " + windowsVersionsString.toUpperCase());
        }

        System.out.println("Thanks, your Windows version is " + version);

    }

}
