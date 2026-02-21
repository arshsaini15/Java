package CollectionFramework.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetWorking {
    public static void main(String[] args) {
        System.out.println("\n---- TreeSet ----");

        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(30);         // O(log n)
        treeSet.add(10);
        treeSet.add(20);

        System.out.println("Contains 20: " + treeSet.contains(20)); // O(log n)

        treeSet.remove(10);      // O(log n)

        System.out.println("TreeSet (sorted): " + treeSet);
    }
}
