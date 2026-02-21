package CollectionFramework.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueWorking {
    public static void main(String[] args) {
        System.out.println("---- PriorityQueue ----");

        Queue<Integer> pq = new PriorityQueue<>(); // min-heap
        Queue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder()); // max-heap

        pq.add(30);              // O(log n)
        pq.add(10);
        pq.add(20);

        System.out.println("Peek: " + pq.peek()); // O(1)

        while (!pq.isEmpty()) {
            System.out.println("Poll: " + pq.poll()); // O(log n)
        }

    }
}
