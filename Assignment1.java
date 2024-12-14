import java.util.*;

public class Assignment1 {
    public static void main(String[] args) {
        SavingAccount account = new SavingAccount(12345, "John Doe", 1000.0, 2.0);
        account.Interest();
        System.out.println("Account Holder: " + account.getName());
        System.out.println("Balance after interest: " + account.getBalance());
    }
}

class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    int getNumber() {
        return accountNumber;
    }

    String getName() {
        return accountHolderName;
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingAccount extends Account {
    private double interestRate;

    SavingAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    double getInterest() {
        return interestRate;
    }

    void Interest() {
        double interest = getBalance() * (interestRate / 100);
        setBalance(getBalance() + interest);
    }
}
