package CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetWorking {
    public static void main(String[] args) {
        System.out.println("---- HashSet ----");

        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(10);         // O(1) average
        hashSet.add(20);
        hashSet.add(10);         // Duplicate ignored

        System.out.println("Contains 20: " + hashSet.contains(20)); // O(1)

        hashSet.remove(20);      // O(1)

        System.out.println("HashSet: " + hashSet);
    }
}
