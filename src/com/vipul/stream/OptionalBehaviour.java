package com.vipul.stream;

import com.vipul.basics.GenericsBasics;

import java.util.Optional;

public class OptionalBehaviour {

    public static void main(String[] args) {
        OptionalWrapper();
    }

    public static void testOptionalifPresent() {
        Optional<Integer> opt = Optional.of(10);
        opt.ifPresent(i -> {
            throw new RuntimeException();
        });
    }

    public static void OptionalWrapper() {
        GenericsBasics baseModel = new GenericsBasics();
        Optional<String> opt = Optional.of(baseModel)
                                       .map(baseModel1 -> baseModel1.toString())
                                       .flatMap(str -> Optional.of(str.toString()));
        System.out.println(opt.isPresent());


    }
}
