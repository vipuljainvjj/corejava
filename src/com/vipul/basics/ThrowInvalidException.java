package com.vipul.basics;

import java.util.HashSet;
import java.util.Random;
import java.util.stream.IntStream;

public class ThrowInvalidException {

    public static void main(String[] args) {

        IntStream.range(0, 100).forEach( i -> {
            Random random = new Random();
            int randomNumber = random.nextInt();
            if ( i > randomNumber) {
                throw new IllegalStateException("Random Number is greater then Counter");//InvalidException("Random Number is greater then counter");
            }
        });
    }
}
