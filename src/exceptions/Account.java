package exceptions;

public class Account {
    private int number;
    private double balance;

    public Account(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= balance)
            balance -= amount;
        else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }

    }

}
