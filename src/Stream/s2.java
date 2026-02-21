package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class s2 {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1,2,3,4);


        int arr[] = {1,2,3};
        Arrays.stream(arr).average().getAsDouble();

        double x = lst.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        System.out.println(x);


        String s[] = {
                "alkasf",
                "alksfmmlma",
                "afnkjlanfa",
                "kvnklnskvsa"
        };

        Arrays.stream(s)
                .sorted()
                .filter(c -> c.charAt(0) == 'a' && c.charAt(c.length()-1) == 'a')
                .forEach(c -> System.out.println(c));
    }
}
