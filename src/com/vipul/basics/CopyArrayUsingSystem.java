package com.vipul.basics;

import java.util.Arrays;
import java.util.stream.Stream;

public class CopyArrayUsingSystem {

	public static void main(String[] args) {
        // create an array
		Stream<Integer> myStream = Stream.iterate(2, (i) -> i + 2).limit(10);

		Integer[] src = myStream.toArray(Integer[]::new);
		Integer[] dest = new Integer[20];
		
		System.arraycopy(src, 0, dest, 5, 10);
		
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dest));
	}
}
