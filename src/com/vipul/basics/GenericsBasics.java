package com.vipul.basics;

import java.util.ArrayList;
import java.util.List;

public class GenericsBasics {

    public static void main(String[] args) {
        //SimpleGeneric<Number> numberSimpleGeneric = new SimpleGeneric<Integer>();

        List<? extends Number> numbers = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        integers.add(5);

        //numbers.addAll(integers);
        numbers = integers;

        System.out.println(numbers);

    }
}
