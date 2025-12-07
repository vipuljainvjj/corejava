package com.vipul.stream;

import java.util.Arrays;
import java.util.List;

import com.vipul.data.Person;

public class ForEachIterator {
	
	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(
			new Person("Vipul", "Jain", 27),
			new Person("Vishnu", "Sharma", 26),
			new Person("Vinay", "Bonu", 26),
			new Person("Tuchaar", "Gupta", 26)
		);
		
		personList.forEach(p -> System.out.print(p));
	}
}
