import java.util.Scanner;

    public class MiniBankMenu {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n====== Mini Bank System Menu ======");
                System.out.println("1. Create a new account");
                System.out.println("2. Deposit money");
                System.out.println("3. Withdraw money");
                System.out.println("4. View account details");
                System.out.println("5. Exit");
                System.out.print("Enter your choice (1-5): ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println(">> Creating a new account...");

                        break;
                    case 2:
                        System.out.println(">> Depositing money...");

                        break;
                    case 3:
                        System.out.println(">> Withdrawing money...");

                        break;
                    case 4:
                        System.out.println(">> Viewing account details...");

                        break;
                    case 5:
                        System.out.println(">> Exiting the system. Thank you!");
                        break;
                    default:
                        System.out.println("Invalid choice! Please enter a number between 1 and 5.");
                }

            } while (choice != 5);

            sc.close();
        }
    }