// Parent class: BankAccount
class BankAccount {
    // Instance variables
    public String accountNumber;      // Public member
    protected String accountHolder;   // Protected member
    private double balance;           // Private member

    // Constructor to initialize bank account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to access the balance
    public double getBalance() {
        return balance;
    }

    // Public method to modify the balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass: SavingsAccount (Inherits from BankAccount)
class SavingsAccount extends BankAccount {

    // Constructor to initialize savings account details
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance); // Calling the parent constructor
    }

    // Method to display savings account details (Accessing accountNumber and accountHolder)
    public void displaySavingsAccountDetails() {
        // Accessing public member 'accountNumber' and protected member 'accountHolder' from the parent class
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber);   // Accessing public member
        System.out.println("Account Holder: " + accountHolder);  // Accessing protected member
        System.out.println("Balance: $" + getBalance());         // Accessing private member via public method
    }
}

// Main class to test the BankAccount and SavingsAccount classes
public class BankAccountManagement {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account1 = new BankAccount("123456789", "John Doe", 1000.00);
        
        // Displaying account details
        System.out.println("Bank Account 1 Details:");
        account1.displayAccountDetails();
        
        // Depositing and withdrawing money
        account1.deposit(500.00);
        account1.withdraw(200.00);
        
        // Displaying updated account details
        System.out.println("\nUpdated Bank Account 1 Details:");
        account1.displayAccountDetails();

        // Creating a SavingsAccount object
        SavingsAccount savingsAccount1 = new SavingsAccount("987654321", "Alice Smith", 2000.00);
        
        // Displaying savings account details
        System.out.println("\nSavings Account 1 Details:");
        savingsAccount1.displaySavingsAccountDetails();
        
        // Depositing and withdrawing money in savings account
        savingsAccount1.deposit(300.00);
        savingsAccount1.withdraw(150.00);
        
        // Displaying updated savings account details
        System.out.println("\nUpdated Savings Account 1 Details:");
        savingsAccount1.displaySavingsAccountDetails();
    }
}
