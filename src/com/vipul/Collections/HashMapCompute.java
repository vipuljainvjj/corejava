package com.vipul.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class HashMapCompute {

    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("one", 0);

        BiFunction<String, Integer, Integer> myBiFunc = (key, i) -> {
            return i == null ? null : i + 1;
        } ;

        //myMap.compute("one", myBiFunc);
        Function<String, Integer> myFunc = (key) -> {
            return 1;
        };

        myMap.computeIfAbsent("one", myFunc);

        System.out.println(myMap);




    }
}
