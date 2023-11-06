package org.example.week1;

import static input.InputUtils.stringInput;

public class DepartmentCode {
    public static void main(String[] args) {

        String departmentCode = stringInput("Enter department code");

        if (departmentCode.length() == 4) {
            System.out.println("The code is valid");
            departmentCode = departmentCode.toUpperCase();
            System.out.println("The code is " + departmentCode);
        } else {
            System.out.println("The code is not valid");
        }

    }
}
