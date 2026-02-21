package CollectionFramework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeWorking {
    public static void main(String[] args) {
        System.out.println("---- ArrayDeque ----");

        Deque<Integer> deque = new ArrayDeque<>();

        // Queue behavior
        // O(1) Add to Last (Rear)
        deque.offer(10); // [10] <-
        deque.offer(20); // [10, 20] <-
        deque.offer(30); // [10, 20, 30] <-

        // O(1) Remove from First (Front)
        System.out.println("Poll: " + deque.poll()); // 10
        // [20, 30]


        // Stack behavior
        // O(1) Add to First (Front)
        deque.push(40); // -> [40, 20, 30]
        deque.push(50); // -> [50, 40, 20, 30]

        // O(1) Remove from First (Front)
        System.out.println("Pop: " + deque.pop()); // 50
        // [40, 20, 30]

        System.out.println("Deque: " + deque);
    }

    /*
            🔥 So what’s the real difference?

            Method   |  Removes From  |   If Empty
            poll()	 |  Front	      |   Returns  null
            pop()	 |  Front	      |   Throws exception (NoSuchElementException
     */
}
