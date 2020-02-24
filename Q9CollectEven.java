//Q8 Collect all the even numbers from an integer list.

package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q9CollectEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 5, 3, 7, 6, 8, 4, 5);

        System.out.println(
                list
                        .stream()
                        .filter(e -> e % 2 == 0)
                        .collect(Collectors.toList())
        );
    }
}
