package EddieATM;

public class ATMAccount {
    private String acc;
    private String pin;
    private double balance;

    public ATMAccount(String acc, String pin, double balance) {
        this.acc = acc;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAcc() { return acc; }
    public String getPin() { return pin; }
    public double getBalance() { return balance; }

    public double withdraw(double money) {
        if (money <= 0) throw new IllegalArgumentException("Withdraw mus be positive.");
        if (balance >= money) {
            balance -= money;
            return money;
        } else throw new IllegalArgumentException("You can not excseed balance.");
    }

    public double deposit(double money) {
        if (money <= 0) throw new IllegalArgumentException("Deposit must be positive.");
        balance += money;
        return money;
    }
}