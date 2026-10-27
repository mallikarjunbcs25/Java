import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public void acceptDetails(Scanner sc) {
        System.out.print("Enter Account Number: ");
        this.accountNumber = sc.next();
        sc.nextLine(); // consume newline
        System.out.print("Enter Account Holder Name: ");
        this.accountHolderName = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        this.balance = sc.nextDouble();
    }

    public void displayDetails() {
        System.out.println("Account No: " + accountNumber + " | Name: " + accountHolderName + " | Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of accounts: ");
        int count = sc.nextInt();

        BankAccount[] accounts = new BankAccount[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\n--- Entering details for Account " + (i + 1) + " ---");
            accounts[i] = new BankAccount();
            accounts[i].acceptDetails(sc);
        }

        System.out.println("\n--- Bank Account Details ---");
        for (BankAccount acc : accounts) {
            acc.displayDetails();
        }

        sc.close();
    }
}