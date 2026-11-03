class Buffer {
    int data;
    boolean available = false;

    synchronized void produce(int value) throws Exception {
        while (available) {
            wait();
        }

        data = value;
        available = true;

        System.out.println("Produced: " + data);
        notify();
    }

    synchronized void consume() throws Exception {
        while (!available) {
            wait();
        }

        System.out.println("Consumed: " + data);
        available = false;

        notify();
    }
}

class ProducerConsumerDemo {
    public static void main(String[] args) {
        Buffer b = new Buffer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    b.produce(i);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    b.consume();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        producer.start();
        consumer.start();
    }
}
