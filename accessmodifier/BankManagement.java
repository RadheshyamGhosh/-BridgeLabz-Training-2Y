package accessmodifier;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accNum, String accHolder, double balance) {
        this.accountNumber = accNum;
        this.accountHolder = accHolder;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accNum, String accHolder, double balance, double interestRate) {
        super(accNum, accHolder, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);  // public access
        System.out.println("Account Holder: " + accountHolder);  // protected access
        System.out.println("Balance: $" + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankManagement {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("ACC123", "Alice", 5000, 3.5);
        sa.displayAccountInfo();

        // Modify balance using setter
        sa.setBalance(5500);
        System.out.println("Updated Balance: $" + sa.getBalance());
    }
}
