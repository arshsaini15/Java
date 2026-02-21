package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapWorking {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();

        mp.put(1, "one");
        mp.put(2, "two");
        mp.put(3, "three");

        for(Integer key : mp.keySet()) {
            System.out.println(mp.get(key));
        }

        for(String value : mp.values()) {
            System.out.println(value);
        }

        for(Map.Entry<Integer, String> entry : mp.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
