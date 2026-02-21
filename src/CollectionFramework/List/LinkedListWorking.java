package CollectionFramework.List;

import java.util.LinkedList;

public class LinkedListWorking {

    public static void main(String[] args) {
        System.out.println("--- LinkedList ---");

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);          // O(1)
        list.addFirst(5);      // O(1)
        list.addLast(20);      // O(1)

        list.get(1);           // O(n)

        list.removeFirst();    // O(1)
        list.removeLast();     // O(1)

        System.out.println(list);
    }
}
