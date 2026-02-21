package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetWorking {
    public static void main(String[] args) {
        System.out.println("\n--- HashSet ---");

        Set<Integer> set = new HashSet<>();

        set.add(10);           // O(1) average
        set.add(20);
        set.add(10);           // duplicate ignored

        set.remove(20);        // O(1)

        System.out.println(set.contains(10));  // O(1)

        System.out.println(set);

    }
}
