package Prof_ArrayDemo;

import java.util.Scanner;
public class Assignment {

    // Public usage for Data Array; acting as database.
    static int[] dataArray = new int [11];
    static String[] nameArray = new String [11];

    // Public scanner for inputs
    static Scanner input = new Scanner(System.in);

    static void main() { // Treat this as `psvm` (public static void main string args). Intellij just wants it to be removed.
        while (true) { // Recommendation: Removed boolean = false to simplify things up.
            displayMenu();
            System.out.print("Enter value: ");
            int valueChoice = input.nextInt();

            switch (valueChoice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    retrieveStudent();
                    break;
                case 3:
                    showAllStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("Thank you for using our System Management System!");
                    System.exit(0);
                    break;
            }
        }
    }

    public static void addStudent() {
        System.out.print("Enter Unused Student ID: ");
        int positionArr =  input.nextInt();

        if (positionArr < 1 || positionArr > 10) {
            System.out.println("Please enter a valid Student ID!");
            return;
        }

        dataArray[positionArr] = positionArr;
        System.out.print("Enter Student Name: ");
        String studentName = input.next();
        nameArray[positionArr] = studentName;

        System.out.println(studentName + " has been added with an ID of " + positionArr);
    }

    public static void retrieveStudent() {
        System.out.print("Enter Student ID: ");
        int positionArr =  input.nextInt();

        if (positionArr < 1 || positionArr > 10 || nameArray[positionArr] == null) {
            System.out.println("No student ID was found.");
        } else {
            System.out.println("Student Name: " + nameArray[positionArr]);
        }
    }

    public static void showAllStudent() {
        boolean found = false;

        for (int i = 1; i < dataArray.length; i++) {
            if (dataArray[i] != 0) {
                System.out.println(dataArray[i] + " " +  nameArray[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No student found. Tip: Add a student first in the array to show at least 1 or more students.");
        }
    }

    public static void updateStudent() {
        System.out.print("Enter an existing ID: ");
        int positionArr =  input.nextInt();

        if (positionArr < 1 || positionArr > 10 || nameArray[positionArr] == null) {
            System.out.println("No student ID was found. Tip: Add a student first in the array you want to update.");
        } else {
            System.out.print("Enter new Student Name: ");
            String newStudentName = input.next();

            nameArray[positionArr] = newStudentName;
            System.out.println("Student ID: " + positionArr + "updated successfully!");
        }
    }

    public static void deleteStudent() {
        System.out.print("Enter an existing ID: ");
        int positionArr =  input.nextInt();

        if (positionArr < 1 || positionArr > 10 || nameArray[positionArr] == null) {
            System.out.println("No student ID was found. Tip: Add a student first in the array you want to delete.");
        } else {
            dataArray[positionArr] = 0;
            nameArray[positionArr] = null;
            System.out.println("Student ID: " + positionArr + " deleted successfully!");
        }
    }

    public static void displayMenu() {
        System.out.println("Welcome to Student Management System!");
        System.out.println("1. Add Student");
        System.out.println("2. View Student (ID)");
        System.out.println("3. View All Student Records");
        System.out.println("4. Update a Student");
        System.out.println("5. Delete a Student");
        System.out.println("6. Exit");
    }
}