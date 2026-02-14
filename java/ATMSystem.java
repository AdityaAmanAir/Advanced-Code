import java.util.Scanner;

public class ATMSystem {
    private double balance;
    
    public ATMSystem(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
            System.out.println("Your balance: INR" + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Withdrawn: INR" + amount);
            System.out.println("Remaining balance: INR" + balance);
        }
    }
    
    public void displayBalance() {
        System.out.println("Current balance: INR" + balance);
    }
    
    public static void main(String[] args) {
        ATMSystem atm = new ATMSystem(5000.00);
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Withdraw");
            System.out.println("2. Check Balance");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: INR");
                    double amount = scanner.nextDouble();
                    atm.withdraw(amount);
                    break;
                    
                case 2:
                    atm.displayBalance();
                    break;
                    
                case 3:
                    System.out.println("Thank you for using our ATM!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}