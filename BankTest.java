public class BankTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Idris", "A123", 1000.0);
        BankAccount account2 = new BankAccount("Albaraa", "B456", 500.0);

        account1.showAccountInfo();
        System.out.println();
        account2.showAccountInfo();
    }
}
