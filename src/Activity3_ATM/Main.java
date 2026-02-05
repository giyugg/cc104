/* Objective on this activity:
Write an OOP program that simulates an ATM Transactions including method for
`DEPOSIT, WITHDRAW, BALANCE INQUIRY, AND EXIT`. Users can deposit any amount
but withdrawals can be only be made in denominations of 1000, 500, 200, or 100.
Initial and maintaining balance should be 2000 and withdrawable amount must not
reach below 2000 of the balance
 */
package Activity3_ATM;

import java.util.Scanner;

public class Main {
    static double initialBalance = 2000;
    static Scanner input = new Scanner(System.in);
    static Methods config =  new Methods();

    static void main() {
        while (true) {
            System.out.println("----------------------");
            System.out.println("ATM Machine Simulation");
            System.out.println("----------------------");
            System.out.println("[1] - Deposit");
            System.out.println("[2] - Withdraw");
            System.out.println("[3] - Balance Inquiry");
            System.out.println("[4] - Display Menu");
            System.out.println("[5] - Exit");

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    Methods.depositLogic(depositAmount);
                    break;
                case 5:
                    config.exitLogic();
            }
        }
    }
}
