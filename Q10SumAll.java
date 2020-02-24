package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q10SumAll {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,4,2,6,4,5,7);
        System.out.println(
        integerList
                .stream()
                .filter(e -> e>5)
                .collect(Collectors.summingInt(e -> e))
        );
    }
}
