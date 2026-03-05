package rphPhilippineMapReviewer;
import java.util.Scanner;
public class Main {
    static void main() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to Philippine Map Reviewer!");
            System.out.println("This program is created by Kyle Acuña of BSIS 1B-G2 in preparation for");
            System.out.println("Quiz in RPH involving memorizing Main Cities and Provinces");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("1. Start");
            System.out.println("2. Quit");
            System.out.print("Choose: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("What do you want to recite?");
                    System.out.println("A. Main Cities by their Provinces");
                    System.out.println("B. Provinces by their Main Cities");
                    System.out.print("Choose: ");
                    char reciteChoice = input.next().charAt(0);
                    if (reciteChoice == 'a' || reciteChoice == 'A') {
                        
                    }
                case 2:
            }
        }
    }
}
