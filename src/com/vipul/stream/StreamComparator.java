package com.vipul.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparator {
	
	public static void main(String[] args) {
		
		List<String> list  = Arrays.asList("1245", "Vipul", "4567", "Jain");
		List<String> mySortedList =
						list.stream()
							//.sorted( Comparator.comparing(String::length).reversed() )
							//	.sorted((str1, str2) -> str1.compareTo(str2))
								.sorted(Comparator.naturalOrder())
							.collect(Collectors.toList());
		System.out.println(mySortedList);
		
		
	}

}
