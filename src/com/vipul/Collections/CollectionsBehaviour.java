package com.vipul.Collections;

import java.util.*;

public class CollectionsBehaviour {
	
	public static void main(String[] args) {
		
		String[] nameArray = {"Ramesh", "Suresh", "Vinay", "Amar", "Rahul", "Titanic", "Beena", "Mohit", "rishbav",
				"writer", "Umesh", "Titanic", "Naruto", "kakarot", "SAMeaul", "Lovely"};
		List<String> nameList = Arrays.asList(nameArray);
		System.out.println(Arrays.toString(nameArray));
		
		ArrayList<String> myArrayList = new ArrayList<>(nameList);
		System.out.println(myArrayList);
		
		LinkedList<String> myLinkedList = new LinkedList<>(nameList);
		System.out.println(myLinkedList);
		
		HashSet<String> myHashSet = new HashSet<String>(nameList);
		System.out.println(myHashSet);
		
		LinkedHashSet<String> myLinkedHashSet = new LinkedHashSet<>(nameList);
		System.out.println(myLinkedHashSet);
		
		TreeSet<String> myTreeSet = new TreeSet<>(nameList);
		System.out.println(myTreeSet);

		System.out.println("===================================================================");

		// Should not use this
		TreeSet<String> treeSetComparator = new TreeSet<>(Comparator.comparing(String::length));
		//treeSetComparator.addAll(nameList);
		nameList.stream().forEach(name -> {
			treeSetComparator.add(name);
		});

		Collections.sort(nameList, Comparator.comparing(String::length));
		System.out.println(nameList);
	}

}
