//Q11 Find average of the number inside integer list after doubling it.

package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q11AverageAfterDouble {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,6,9,7,8,3,2,4);
        System.out.println(
            integerList
                    .stream()
//                    .map(e -> e*2)
                    .collect(Collectors.averagingInt(e -> e*2))
        );
    }
}
