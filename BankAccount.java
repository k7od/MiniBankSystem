public class BankAccount {
    String accountName;
    String accountNumber;
    double balance;

    // Constructor
    public BankAccount(String name, String number, double initialBalance) {
        this.accountName = name;
        this.accountNumber = number;
        this.balance = initialBalance;
    }

    public void showAccountInfo() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
