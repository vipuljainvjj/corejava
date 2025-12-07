package com.vipul.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import com.vipul.data.Person;

public class Listing1_3Optional {

	public static void main(String[] args) {
		
		// Sample List
		List<Person> personList = Arrays.asList(
			new Person("Vipul", "Jain", 27),
			new Person("Vishnu", "Sharma", 26),
			new Person("Vinay", "Bonu", 26),
			new Person("Tuchaar", "Gupta", 26)
		);
		
		Stream<Person> stream1 = personList.stream();
		Optional<Person> optional1 = stream1.filter( (p) -> p.getAge() > 20).findFirst();
		System.out.println("Age > 20: " + optional1.orElse(new Person()));
		
		Set<Person> set1 = new HashSet<>();
		optional1.ifPresent((e) -> set1.add(e));
		Optional<Boolean> added = optional1.map( (e) -> set1.add(e) );
		System.out.println(added);
		
		// Collectors
		
		
		
		
		
		
		
	}
}
