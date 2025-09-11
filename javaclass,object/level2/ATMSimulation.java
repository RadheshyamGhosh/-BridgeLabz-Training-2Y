class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit Method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw Method
    void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Display Balance
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
        System.out.println("-------------------------------");
    }
}

public class ATMSimulation {
    public static void main(String[] args) {
        // Create a bank account with random initial balance
        BankAccount acc1 = new BankAccount("Radheshyam", "ACC12345", 5000);

        // Display initial balance
        acc1.displayBalance();

        // Perform transactions
        acc1.deposit(2000);   // deposit 2000
        acc1.withdraw(1500);  // withdraw 1500
        acc1.withdraw(7000);  // try withdrawing more than balance

        // Final balance
        acc1.displayBalance();
    }
}
