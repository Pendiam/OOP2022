package exceptions;

public class BankDemo {
    public static void main(String[] args) {
        Account savings = new Account(58613);

        System.out.println("Depositing $500...");
        savings.deposit(500.00);

        try {
            System.out.println("\nWithdrawing $300...");
            savings.withdraw(300.00);

            System.out.println("\nWithdrawing $400...");
            savings.withdraw(400.00);
        } catch (InsufficientFundsException e) {
            System.err.println("Sorry, but you are short $" + e.getAmount());
        } finally {
            System.out.println("Balance: $" + savings.getBalance());
        }

    }

}
