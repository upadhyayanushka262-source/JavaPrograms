class FiveThreadsDemo extends Thread {
    FiveThreadsDemo(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() +
                    " Priority: " + getPriority() +
                    " Count: " + i);
        }
    }

    public static void main(String[] args) {
        FiveThreadsDemo t1 = new FiveThreadsDemo("Thread 1", 1);
        FiveThreadsDemo t2 = new FiveThreadsDemo("Thread 2", 3);
        FiveThreadsDemo t3 = new FiveThreadsDemo("Thread 3", 5);
        FiveThreadsDemo t4 = new FiveThreadsDemo("Thread 4", 7);
        FiveThreadsDemo t5 = new FiveThreadsDemo("Thread 5", 10);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}