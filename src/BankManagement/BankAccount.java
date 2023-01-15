package BankManagement;

public class BankAccount {
    protected double balance;
    protected String name;
    protected int customerId;

    BankAccount(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void deposit(double amount) {
        if(amount != 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (getBalance() > 0 && amount <= getBalance()) {
            balance -= amount;
        }
        else {
            System.out.println("Insufficient funds");
        }
    }
}
