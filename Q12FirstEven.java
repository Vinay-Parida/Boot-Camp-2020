//Q12 Find the first even number in the integer list which is greater than 3.

package com.company;

import java.util.Arrays;
import java.util.List;

public class Q12FirstEven {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,4,2,7,6,4,5,9,4,2,3,7,8);
        System.out.println(
            integerList
                    .stream()
                    .filter(e -> e>3)
                    .filter(e -> e%2==0)
                    .findFirst().get()
        );
    }
}
