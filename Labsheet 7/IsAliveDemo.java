class IsAliveDemo extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) throws Exception {
        IsAliveDemo t = new IsAliveDemo();

        System.out.println("Before start: " + t.isAlive());

        t.start();

        System.out.println("While running: " + t.isAlive());

        t.join();

        System.out.println("After finish: " + t.isAlive());
    }
}