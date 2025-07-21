import java.util.Scanner;

// Step 3, 4, 6, 8: BankAccount class
class BankAccount {
    String accountName;
    String accountNumber;
    double balance;

    public BankAccount(String name, String number, double initialBalance) {
        this.accountName = name;
        this.accountNumber = number;
        this.balance = initialBalance;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    // Withdraw money from the account
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            System.out.println("New Balance: " + balance);
        }
    }

    // Method to show account information
    public void showAccountInfo() {
        System.out.println("\n--- Account Information ---");
        System.out.println("Account Name   : " + accountName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
    }
}

// Step 7, 8: Inherited class for savings account
class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String name, String number, double balance, double interestRate) {
        super(name, number, balance);
        this.interestRate = interestRate;
    }

    // Apply interest to the current balance
    public void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest applied: " + interest);
    }

    // Override method to include interest rate
    @Override
    public void showAccountInfo() {
        super.showAccountInfo();
        System.out.println("Interest Rate  : " + interestRate + "%");
    }
}

// Step 2, 5: Main menu logic and object creation
public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null; // Polymorphic reference
        int choice;

        do {
            // Display menu
            System.out.println("\n=== Bank Menu ===");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. View account details");
            System.out.println("5. Apply interest (Savings only)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Create account
                    System.out.print("Enter account type (1: Regular, 2: Savings): ");
                    int type = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter account name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter account number: ");
                    String number = scanner.nextLine();

                    System.out.print("Enter initial balance: ");
                    double balance = scanner.nextDouble();

                    if (type == 1) {
                        account = new BankAccount(name, number, balance);
                    } else if (type == 2) {
                        System.out.print("Enter interest rate (%): ");
                        double rate = scanner.nextDouble();
                        account = new SavingsAccount(name, number, balance, rate);
                    } else {
                        System.out.println("Invalid account type!");
                    }
                    break;

                case 2:
                    // Deposit
                    if (account != null) {
                        System.out.print("Enter amount to deposit: ");
                        double deposit = scanner.nextDouble();
                        account.deposit(deposit);
                    } else {
                        System.out.println("No account found. Please create one first.");
                    }
                    break;

                case 3:
                    // Withdraw
                    if (account != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdraw = scanner.nextDouble();
                        account.withdraw(withdraw);
                    } else {
                        System.out.println("No account found. Please create one first.");
                    }
                    break;

                case 4:
                    // View account info
                    if (account != null) {
                        account.showAccountInfo(); // Polymorphic call
                    } else {
                        System.out.println("No account found.");
                    }
                    break;

                case 5:
                    // Apply interest (only if SavingsAccount)
                    if (account instanceof SavingsAccount) {
                        ((SavingsAccount) account).applyInterest();
                    } else if (account == null) {
                        System.out.println("No account found.");
                    } else {
                        System.out.println("Interest applies only to Savings Account.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        scanner.close();
    }
}
