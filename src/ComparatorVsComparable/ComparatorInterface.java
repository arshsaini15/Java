package ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {
    public static void main(String[] args) {
        Comparator<Integer> com = (a, b) -> a%10 > b%10 ? 1 : -1; // calls compare();

//        Comparator<Integer> com = (a, b) -> Integer.compare(a, b);

        List<Integer> nums = new ArrayList<>();

        nums.add(43);
        nums.add(21);
        nums.add(34);
        nums.add(92);

        Collections.sort(nums, (a, b) -> a%10 > b%10 ? 1 : -1);

        for(int num : nums){
            System.out.println(num + " ");
        }
    }
}
