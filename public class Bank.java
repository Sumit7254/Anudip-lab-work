public class Bank {
    private double balance;

    public Bank(double initialBalance) {
        balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful");
        } else {
            System.out.println("Deposit failed. Invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        Bank account = new Bank(10000);
        account.displayBalance();
        account.withdraw(5000);
        account.deposit(3000);
        account.displayBalance();
    }
}
