import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Name = "John";
        String TypeAccount = "Corrent";
        double balance = 1000.50;
        int options = 0;

        System.out.println("******************");
        System.out.println("\nClient Name: " + Name);
        System.out.println("Account Type: " + TypeAccount);
        System.out.println("Account Balance: $" + balance);
        System.out.println("\n******************");

        String menu = """
                ** Banking Menu **
                1. Check Balance
                2. transfer
                3. receive value
                4. Exit
                Please select an option:
                """;
        Scanner leitor = new Scanner(System.in);

        while (options != 4) {
            System.out.println(menu);
            options = leitor.nextInt();

            if (options == 1) {
                System.out.println("Your current Balance is: $" + balance);
            } else if (options == 2) {
                System.out.println("Enter the amount to transfer:");
                double amount = leitor.nextDouble();
                if (amount > balance) {
                    System.out.println("Insufficient balance for transfer.");
                } else {
                    balance -= amount;
                    System.out.println("Transfer successful! New balance: $" + balance);
                }
            } else if (options == 3) {
                System.out.println("Enter the amount to receive:");
                double amount = leitor.nextDouble();
                balance += amount;
                System.out.println("Amount received! New balance: $" + balance);
            } else if (options == 4) {
                System.out.println("Exiting the banking menu. Thank you!");
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}