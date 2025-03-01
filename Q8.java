/*Q8. Develop a Java banking application using polymorphism with three classes: Account,
SavingsAccount, and CurrentAccount. The abstract Account class has private
attributes (accountNumber, balance) and abstract methods for deposit and
withdrawal. SavingsAccount adds an interestRate attribute, overrides deposit to
calculate interest, and ensures sufficient balance in withdrawal. CurrentAccount
introduces an overdraftLimit and overrides withdrawal to check this limit. In the
BankingApp class, instantiate both account types, perform transactions, and display
account details to demonstrate polymorphism. */
public class Q8 {
    public static void main(String[] args) {
        // Instantiate SavingsAccount and CurrentAccount
        Account savings = new SavingsAccount("S123", 1000.0, 0.05);
        Account current = new CurrentAccount("C123", 2000.0, 500.0);

        // Perform transactions
        savings.deposit(500.0);
        savings.withdraw(200.0);
        current.deposit(1000.0);
        current.withdraw(2500.0);

        // Display account details
        savings.displayAccountInfo();
        current.displayAccountInfo();
    }
}

abstract class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        double interest = amount * interestRate;
        setBalance(getBalance() + amount + interest);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}
