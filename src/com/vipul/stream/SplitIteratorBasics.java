package com.vipul.stream;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SplitIteratorBasics {

    public static void main(String[] args) {
        List<Integer> intList = Stream.iterate(0, i -> i + 1).limit(25).collect(Collectors.toList());
        Spliterator<Integer> iterator1 =  intList.spliterator();
        iterator1.forEachRemaining(System.out::print);
        System.out.println();
        System.out.println("========================================================");

        Spliterator<Integer> iterator2 =  intList.spliterator();
        System.out.println(iterator2.tryAdvance(System.out::print));
        System.out.println(iterator2.tryAdvance(System.out::print));
        System.out.println(iterator2.tryAdvance(System.out::print));
        System.out.println(iterator2.tryAdvance(System.out::print));
        System.out.println("========================================================");

        Spliterator<Integer> iterator4 =  intList.spliterator();
        Spliterator<Integer> iterator5 =  iterator4.trySplit();
        iterator4.forEachRemaining(System.out::print);
        System.out.println("========================================================");
        iterator5.forEachRemaining(System.out::print);
        System.out.println("========================================================");
    }

}