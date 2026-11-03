class PriorityDemo extends Thread {
    PriorityDemo(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " is running.");
    }

    public static void main(String[] args) {
        PriorityDemo t1 = new PriorityDemo("High Priority");
        PriorityDemo t2 = new PriorityDemo("Low Priority");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(t1.getName() + ": " + t1.getPriority());
        System.out.println(t2.getName() + ": " + t2.getPriority());

        t1.start();
        t2.start();
    }
}