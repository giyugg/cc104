package Assign_StudentMgtSys;

import java.util.Scanner;

public class Main {
    // Public usage for data array; acting as database.
    static int[] idArray = new int[11];
    static String[] nameArray = new String [11];

    // Public or global scanner for inputs.
    static Scanner input = new Scanner(System.in);
    // Calls the StudentManagementSystem.java class.
    static StudentManagementSystem stdMgtSys =  new StudentManagementSystem();

    static void main() {
        boolean flag = true;
        while (flag) {
            stdMgtSys.displayMenu();
            System.out.print("Enter your choice: ");
            int valueChoice = input.nextInt();

            switch (valueChoice) {
                case 1:
                    System.out.print("Enter Unused Student ID: ");
                    int positionArr =  input.nextInt();

                    input.nextLine(); // idk but this is a bug-fix?

                    System.out.print("Enter Student Name: ");
                    String studentName = input.nextLine();
                    stdMgtSys.addStudent(positionArr, studentName); break;
                case 2:
                    System.out.print("Enter Student ID: ");
                    int searchId = input.nextInt();
                    // Pro tip if you are confused in `searchId`: The "searchId" is just the delivery truck that carries the number to the "positionArr" factory.
                    stdMgtSys.retrieveStudent(searchId); break;
                case 3:
                    stdMgtSys.showAllStudent(); break;
                case 4:
                    System.out.print("Enter an existing ID: ");
                    int existingId = input.nextInt(); // existingId is positionArr.
                    stdMgtSys.updateStudent(existingId); break;
                case 5:
                    System.out.print("Enter an existing ID: ");
                    int deletedArr = input.nextInt();
                    stdMgtSys.deleteStudent(deletedArr); break;
                case 6:
                    stdMgtSys.terminateProgram();
                    flag = false; break;
                default:
                    System.out.println("Wrong choice! Please try again!"); break;
            }
        }
    }
}
