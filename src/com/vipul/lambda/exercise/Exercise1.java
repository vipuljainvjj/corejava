package com.vipul.lambda.exercise;

import com.vipul.data.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise1 {
	
	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(
			new Person("Vipul", "Jain", 27),
			new Person("Vishnu", "Sharma", 26),
			new Person("Vinay", "Bonu", 26),
			new Person("Tuchaar", "Gupta", 26)
		);

		HashSet<String> set = new HashSet<>();
		personList.forEach((Person person) -> {
			set.add(person.getFirstName());
		});
		// Instead of above code use this approach
		Set<String> uniqueNameList = personList.stream()
											.map(Person::getFirstName)
											.collect(Collectors.toSet());

		SortingInterface<Person> myLambdaSort = list -> Collections.sort(list);
		myLambdaSort.sort(personList);
		System.out.println(personList);
		System.out.println("=================");

		PrintInterface<Person> myLambdaPrint = (List<Person> list) -> {
			for(Person element : list) {
				System.out.println(element);
			}
		};
		myLambdaPrint.print(personList);
		System.out.println("=================");


		SpecificFilter<Person> myLambdaFilter = (s, list) -> {
			for(Person p : list) {
		    	if (p.getLastName().toLowerCase().endsWith(s.toLowerCase())) {
		  			System.out.println(p);
				}
			}
		};
		myLambdaFilter.printSpecific("A", personList);
	}

}