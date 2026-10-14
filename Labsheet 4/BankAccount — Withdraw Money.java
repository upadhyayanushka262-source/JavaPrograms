class BankAccount {
    double balance;
    static String bankCode = "SBI001";

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            double newBalance = balance - amount;
            balance = newBalance;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance or Invalid Amount");
        }
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.balance = 5000;

        System.out.println("Bank Code: " + bankCode);
        b.withdraw(1500);
    }
}