class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }
}

public class Q2BankAccount {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.setAccountNumber("12345");
        b.setAccountHolder("Anu");
        b.setBalance(1000);

        b.deposit(500);
        b.withdraw(200);
        b.withdraw(2000);

        System.out.println("Account Number: " + b.getAccountNumber());
        System.out.println("Account Holder: " + b.getAccountHolder());
        System.out.println("Balance: " + b.getBalance());
    }
}