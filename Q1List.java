package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q1List {
    public static void main(String[] args) {
        List<Float> floatList = new ArrayList<>();

        floatList.add(14.23f);
        floatList.add(36.98f);
        floatList.add(69.96f);
        floatList.add(619f);
        floatList.add(420f);

        Iterator<Float> i = floatList.iterator();

        float f = 0;
        while(i.hasNext()){
            f = f+ i.next();
        }

        System.out.println("Sum of elements of the list: " + f);

    }
}
