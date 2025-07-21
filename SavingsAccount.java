public class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String name, String number, double balance, double interestRate) {
        super(name, number, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest applied: " + interest);
        System.out.println("New Balance after interest: " + balance);
    }
}
