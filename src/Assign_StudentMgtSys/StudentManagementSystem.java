package Assign_StudentMgtSys;

import java.util.Arrays;

import static Assign_StudentMgtSys.Main.*;
public class StudentManagementSystem {

    void displayMenu() {
        // FOR EACH!!! USING STRING ARRAY
        for (String s : Arrays.asList("Welcome to Student Management System!", "1. Add Student", "2. View Student (ID)", "3. View All Student Records", "4. Update a Student", "5. Delete a Student", "6. Exit")) {
            System.out.println(s);
        }
    }

    void addStudent(int positionArr, String studentName)  {
        if (positionArr < 1 || positionArr > 10) {
            System.out.println("Please enter a valid Student ID: ");
            return;
        } else if (idArray[positionArr] != 0) {
            System.out.println("User ID " + positionArr + " already exists! Trying to change the user's name? Update a student by choosing 4 on the menu.");
            return;
        } else {
            System.out.println("Student " + studentName + " has been added with an ID of " + positionArr + "!");
        }

        idArray[positionArr] = positionArr;
        nameArray[positionArr] = studentName;
    }

    void retrieveStudent(int positionArr) {
        if (positionArr < 1 || positionArr > 10 || nameArray[positionArr] == null) {
            System.out.println("No student ID was found.");
        } else {
            System.out.println("Student Name: " + nameArray[positionArr]);
        }
    }

    void showAllStudent() {
        boolean found = false;
        for (int i = 1; i < idArray.length; i++) {
            if (idArray[i] != 0) {
                System.out.println(idArray[i] + " " +  nameArray[i]);
                found = true;
            }
        } if (!found) {
            System.out.println("No student found. Tip: Add a student first in the array to show at least 1 or more students.");
        }
    }

    void updateStudent(int positionArr) {
        if (positionArr < 1 || positionArr > 10 || nameArray[positionArr] == null) {
            System.out.println("No student ID was found. Tip: Add a student first in the array you want to update.");
        } else {
            System.out.print("Enter new Student Name: ");
            input.nextLine(); // another mind-blowing bug-fixing type thing that i don't really understand how it fixes this
            String newStudentName = input.nextLine();

            nameArray[positionArr] = newStudentName;
            System.out.println("Student ID: " + positionArr + "updated successfully!");
        }
    }

    void deleteStudent(int positionArr) {
        if (positionArr < 1 || positionArr > 10 || nameArray[positionArr] == null) {
            System.out.println("No student ID was found. Tip: Add a student first in the array you want to delete.");
        } else {
            idArray[positionArr] = 0;
            nameArray[positionArr] = null;
            System.out.println("Student ID: " + positionArr + " deleted successfully!");
        }
    }

    void terminateProgram() {
        System.out.println("Thank you for using our System Management System!");
        System.exit(0);
    }
}
