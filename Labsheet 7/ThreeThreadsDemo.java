import java.util.Random;

class ThreeThreadsDemo extends Thread {
    ThreeThreadsDemo(String name) {
        super(name);
    }

    public void run() {
        try {
            Thread.sleep(new Random().nextInt(501));
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(getName() + " is working.");
    }

    public static void main(String[] args) {
        new ThreeThreadsDemo("Reader").start();
        new ThreeThreadsDemo("Writer").start();
        new ThreeThreadsDemo("Logger").start();
    }
}