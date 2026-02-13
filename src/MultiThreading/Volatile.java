package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class VolatileExample {

    public static volatile boolean running = true;

    public static void stop() {
        running = false;
        System.out.println("Thread t1 stopped the system!");
    }

    public static void execute() {
        System.out.println("Worker thread started...");

        while (running) {
            // simulate work
        }

        System.out.println("Worker thread noticed running=false and stopped.");
    }

    public static void main(String[] args) {

        // Worker task
        Runnable workerTask = () -> execute();

        // Stopper task
        Runnable stopperTask = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                stop();
            }
        };

        Thread t2 = new Thread(workerTask);
        Thread t1 = new Thread(stopperTask);

        t2.start();
        t1.start();


        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(() -> {
            System.out.println(Thread.currentThread().getName());
        });
    }
}
