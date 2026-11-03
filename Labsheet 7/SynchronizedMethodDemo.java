class BankAccount {
    int balance = 10000;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
        }
    }
}

class SynchronizedMethodDemo extends Thread {
    BankAccount account;

    SynchronizedMethodDemo(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            account.withdraw(1);
        }
    }

    public static void main(String[] args) throws Exception {
        BankAccount account = new BankAccount();

        SynchronizedMethodDemo t1 = new SynchronizedMethodDemo(account);
        SynchronizedMethodDemo t2 = new SynchronizedMethodDemo(account);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance: " + account.balance);
    }
}