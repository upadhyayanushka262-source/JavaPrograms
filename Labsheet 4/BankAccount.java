class BankAccount {
    int accountNumber;
    double balance;
    static String bankName = "SBI";

    void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountNumber = 12345;
        b.balance = 1000;

        System.out.println("Account: " + b.accountNumber);
        System.out.println("Bank: " + bankName);
        b.deposit(500);
    }
}