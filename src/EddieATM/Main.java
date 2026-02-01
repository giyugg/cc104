package EddieATM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountManager manager = new AccountManager();

        while (true) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1: Login");
            System.out.println("2: Create Account");
            System.out.println("3: Delete Account");
            System.out.println("4: Exit");
            System.out.print("Choose: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Account name: ");
                    String accname = scanner.nextLine();
                    System.out.print("PIN: ");
                    String pin = scanner.nextLine();

                    if (manager.verifyPin(accname, pin)) {
                        ATMAccount account = manager.getAccount(accname);
                        System.out.println("Login successful! Balance: " + account.getBalance());

                        boolean loggedIn = true;
                        while (loggedIn) {
                            System.out.println("\n--- Account Menu (" + account.getAcc() + ") ---");
                            System.out.println("1: Check Balance");
                            System.out.println("2: Withdraw");
                            System.out.println("3: Deposit");
                            System.out.println("4: Logout");
                            System.out.print("Choose: ");
                            String action = scanner.nextLine();

                            switch (action) {
                                case "1":
                                    System.out.println("Current Balance: " + account.getBalance());
                                    break;
                                case "2":
                                    System.out.print("Amount to withdraw: ");
                                    double withdrawAmount = Double.parseDouble(scanner.nextLine());
                                    try {
                                        double withdrawn = account.withdraw(withdrawAmount);
                                        manager.saveAccounts();
                                        System.out.println("Withdrawn: " + withdrawn + ". New balance: " + account.getBalance());
                                    } catch (IllegalArgumentException e) {
                                        System.out.println("Error: " + e.getMessage());
                                    }
                                    break;
                                case "3":
                                    System.out.print("Amount to deposit: ");
                                    double depositAmount = Double.parseDouble(scanner.nextLine());
                                    try {
                                        double deposited = account.deposit(depositAmount);
                                        manager.saveAccounts();
                                        System.out.println("Deposited: " + deposited + ". New balance: " + account.getBalance());
                                    } catch (IllegalArgumentException e) {
                                        System.out.println("Error: " + e.getMessage());
                                    }
                                    break;
                                case "4":
                                    loggedIn = false;
                                    System.out.println("Logged out.");
                                    break;
                                default:
                                    System.out.println("Invalid option!");
                            }
                        }
                    } else {
                        System.out.println("Invalid account or PIN!");
                    }
                    break;

                case "2":
                    System.out.print("New account name: ");
                    String newAcc = scanner.nextLine();
                    System.out.print("New PIN: ");
                    String newPin = scanner.nextLine();
                    System.out.print("Initial balance: ");
                    double balance = Double.parseDouble(scanner.nextLine());

                    if (manager.createAccount(newAcc, newPin, balance)) {
                        System.out.println("Account created!");
                    } else {
                        System.out.println("Account already exists!");
                    }
                    break;

                case "3":
                    System.out.print("Account name to delete: ");
                    String delAcc = scanner.nextLine();
                    if (manager.deleteAccount(delAcc)) {
                        System.out.println("Account deleted!");
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case "4":
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}