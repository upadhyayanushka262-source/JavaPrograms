class BankAccount {
    int balance = 10000;

    void withdraw(int amount) {
        if (balance >= amount) {
            int temp = balance;

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            balance = temp - amount;
        }
    }
}

class RaceConditionDemo extends Thread {
    BankAccount account;

    RaceConditionDemo(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            account.withdraw(1);
        }
    }

    public static void main(String[] args) throws Exception {
        BankAccount account = new BankAccount();

        RaceConditionDemo t1 = new RaceConditionDemo(account);
        RaceConditionDemo t2 = new RaceConditionDemo(account);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance: " + account.balance);
    }
}