package Activity3_ATM;

public class Methods {

    static void depositLogic(double depositAmount) {
        if (depositAmount > 0) {
            initialBalance += depositAmount;
            System.out.println("You have successfully deposited PHP " + depositAmount);
            System.out.println("Your updated balance is PHP " + initialBalance);
        } else {
            System.out.println("Your deposit amount must not be negative or zero.");
        }
    }
    
    static void withdrawLogic(double withdrawAmount) {
        if (withdrawAmount % 100 == 0 && withdrawAmount > 0) {
            if (initialBalance - withdrawAmount >= 2000) {
                initialBalance -= withdrawAmount;
                System.out.println("You have successfully withdrew " + withdrawAmount);
            } else {
                System.out.println("Your account balance is below the minimum balance required. Consider depositing first.");
            }
        } else {
            System.out.println("You can only withdraw an amount with a denominations of 1000, 500, 200, and/or 100.");
        }
    }

    // Feature request: Add a condition if the user wants to go back to main menu.
    // If no, program will end. If yes, call main menu.
    void checkBalance(double initialBalance) {
        System.out.println("Your account has a balance of PHP " + initialBalance);
    }

    static void exitLogic() {
        System.out.println("Thank you for banking with us! Goodbye.");
        System.exit(0);
    }
}
