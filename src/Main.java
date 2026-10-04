import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(1000.0);
       while (true) {
        System.out.println("===Bank Account Management System===");
       
        System.out.println();
        
        System.out.println("1. Deposit money");
        System.out.println("2. Withdraw money");
        System.out.println("3. Check balance");
        System.out.println("4. Exit");

        System.out.println();
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Enter amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                System.out.println("Deposited: " + depositAmount);
                break;
            case 2:
                System.out.println("Enter amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
               try {
                  account.withdraw(withdrawAmount);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 3:
                System.out.println("Current balance: " + account.getBalance());
                break;
            case 4:
                System.out.println("Exiting...");
                return;
            
            default:
                System.out.println("Invalid choice. Please try again.");
        }
       }

    }
}