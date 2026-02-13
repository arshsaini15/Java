package MultiThreading;

class Counter {

    private int count = 0;

    // synchronized ensures only one thread updates count at a time
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SyncDemo {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        // Task that increments counter 10,000 times
        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task); // Refering to same Object
        Thread t2 = new Thread(task); // Refering to same Object

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.getCount());
    }
}
