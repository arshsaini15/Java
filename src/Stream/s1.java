package Stream;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.Stream;

class s1
{
    public static void main (String[] args) throws java.lang.Exception
    {
        List<Integer> nums = List.of(1, 2, 0, 3, 0, 4);

        List<Integer> Liststream = Stream.concat(
                nums.stream().filter(n -> n%2 != 0),
                nums.stream().filter(n -> n%2 == 0)
        ).toList();

        System.out.println(nums.stream().filter(n -> n%2 == 0).toList());

        System.out.println(nums);
    }
}
