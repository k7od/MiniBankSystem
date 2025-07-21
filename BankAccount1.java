public class BankAccount1 {
    String accountName;
    String accountNumber;
    double balance;

    public BankAccount1(String name, String number, double initialBalance) {
        this.accountName = name;
        this.accountNumber = number;
        this.balance = initialBalance;
    }

    public void showAccountInfo() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            System.out.println("New Balance: " + balance);
        }
    }
}
