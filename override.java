// Base class
class BankAccount {
    String accountName;
    String accountNumber;
    double balance;

    // Constructor
    public BankAccount(String name, String number, double balance) {
        this.accountName = name;
        this.accountNumber = number;
        this.balance = balance;
    }

    // Method that will be overridden
    public void showAccountInfo() {
        System.out.println("=== Bank Account Info ===");
        System.out.println("Name: " + accountName);
        System.out.println("Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Derived class with overridden method
class SavingsAccount extends BankAccount {
    double interestRate;

    // Constructor
    public SavingsAccount(String name, String number, double balance, double interestRate) {
        super(name, number, balance);
        this.interestRate = interestRate;
    }

    // Overriding showAccountInfo to include interestRate
    @Override
    public void showAccountInfo() {
        System.out.println("=== Savings Account Info ===");
        System.out.println("Name: " + accountName);
        System.out.println("Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class to demonstrate polymorphism
public class PolymorphismDemo {
    public static void main(String[] args) {
        // Polymorphism: BankAccount reference to SavingsAccount object
        BankAccount account = new SavingsAccount("Aisha", "S12345", 3000.0, 4.5);

        // Even though reference is BankAccount, it calls overridden method in SavingsAccount
        account.showAccountInfo();
    }
}
