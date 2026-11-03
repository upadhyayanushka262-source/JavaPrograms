class BankAccount {
    int balance = 10000;
    Object lock = new Object();

    void withdraw(int amount) {
        synchronized (lock) {
            if (balance >= amount) {
                balance = balance - amount;
            }
        }
    }
}

class SynchronizedBlockDemo extends Thread {
    BankAccount account;

    SynchronizedBlockDemo(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            account.withdraw(1);
        }
    }

    public static void main(String[] args) throws Exception {
        BankAccount account = new BankAccount();

        SynchronizedBlockDemo t1 = new SynchronizedBlockDemo(account);
        SynchronizedBlockDemo t2 = new SynchronizedBlockDemo(account);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance: " + account.balance);
    }
}