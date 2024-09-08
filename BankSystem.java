import java.util.ArrayList;
import java.util.Scanner;

// Interface for taxable accounts
interface Taxable {
    void deductTax();
}

// Base class for a bank account
class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

// SavingsAccount class that inherits from BankAccount
class SavingsAccount extends BankAccount implements Taxable {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    // Overriding the withdraw method to impose a limit
    @Override
    public void withdraw(double amount) {
        if (amount <= 10000) { // Example limit: 10,000
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal limit exceeded for Savings Account!");
        }
    }

    @Override
    public void deductTax() {
        double tax = balance * 0.01; // Example tax of 1%
        balance -= tax;
        System.out.println("Tax deducted: " + tax);
    }
}

// CurrentAccount class that inherits from BankAccount
class CurrentAccount extends BankAccount implements Taxable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Overriding the withdraw method to allow overdraft
    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded for Current Account!");
        }
    }

    @Override
    public void deductTax() {
        double tax = balance * 0.02; // Example tax of 2%
        balance -= tax;
        System.out.println("Tax deducted: " + tax);
    }
}

// Main class to run the system
public class BankSystem {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBank Account Management System");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. View Balance");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
        }
            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String savingsAccountNumber = scanner.next();
                    System.out.print("Enter Account Holder Name: ");
                    String savingsHolderName = scanner.next();
                    System.out.print("Enter Initial Balance: ");
                    double savingsBalance = scanner.nextDouble();
                    System.out.print("Enter Interest Rate: ");
                    double interestRate = scanner.nextDouble();

                    BankAccount savingsAccount = new Savings
            }}}}