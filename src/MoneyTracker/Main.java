package MoneyTracker;
import java.util.Scanner;
import static MoneyTracker.Credentials.*;
import static MoneyTracker.RealTimeBalance.*;

public class Main {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exitApp = false;
        while (!exitApp) {
            System.out.println("Welcome to your Money Tracker CLI App!");
            System.out.println("Please login first before you can access your application. Type exit to quit the application.");

            System.out.print("Enter your username: ");
            String username = input.nextLine();

            if (username.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using our Money Tracker CLI App! Have a good day.");
                exitApp = true;
            }

            // Need to do: Add if statement (or throw catch error? if I want it to be advanced)-
            // when password is incorrect.
            System.out.print("Enter your password: ");
            String password = input.nextLine();

            // Validation header.
            // Need to do: Add a `ctr` to make sure this only has 3 attempts to login, or else `exitApp = true`.
            if (Credentials.isValid(username, password)) {
                System.out.println("Greetings! Welcome to your application. You are logged in as " + username);
                System.out.println("Please choose any action you want to do in the list below.");
                System.out.println("1. Check Balance");
                System.out.println("2. Update Balance (Transfer to Own Account)");
                System.out.println("3. Add Balance (Income)");
                System.out.println("4. Deduct Balance (Expense)");
                System.out.println("5. Delete a Record");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Account Balance: PHP" + RealTimeBalance.accBalance);
                        break;
                    case 6:
                        System.out.println("Exiting, goodbye!");
                        System.exit(0);
                }
            }
        }
    }
}
