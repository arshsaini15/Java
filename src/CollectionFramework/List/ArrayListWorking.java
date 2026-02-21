package CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWorking {
    public static void main(String[] args) {

        List<String> list = new ArrayList();

        list.add("A"); // O(1)
        list.add("B");
        list.add("C");

        System.out.println(list.get(1));   // O(1) fetch value at index

        list.add(1, "XYZ"); // O(N) insertion at specific index

        list.remove("B"); // O(N) removal

        System.out.println(list.contains(30)); // O(N)

        for(String s : list) {
            System.out.println(s);
        }

        System.out.println(list);
    }
}
