package Inheritance;

class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    void displayDetails() {
        System.out.println("Account: " + accountNumber + ", Balance: $" + balance);
    }

    void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accNo, double bal, double rate) {
        super(accNo, bal);
        interestRate = rate;
    }

    void displayAccountType() {
        System.out.println("Savings Account, Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accNo, double bal, double limit) {
        super(accNo, bal);
        withdrawalLimit = limit;
    }

    void displayAccountType() {
        System.out.println("Checking Account, Withdrawal Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int maturityPeriod;

    FixedDepositAccount(String accNo, double bal, int period) {
        super(accNo, bal);
        maturityPeriod = period;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account, Maturity: " + maturityPeriod + " months");
    }
}

public class BankApp {
    public static void main(String[] args) {
        new SavingsAccount("SA101", 5000, 4.5).displayAccountType();
        new CheckingAccount("CA202", 3000, 1000).displayAccountType();
        new FixedDepositAccount("FD303", 10000, 12).displayAccountType();
    }
}
