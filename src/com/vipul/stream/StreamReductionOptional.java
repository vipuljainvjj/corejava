package com.vipul.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

import com.vipul.data.Person;

public class StreamReductionOptional {
	
	public static void main(String[] args) {
		
		// Sample List
		List<Person> personList = Arrays.asList(
			new Person("Vipul", "Jain", 27),
			new Person("Vishnu", "Sharma", 26),
			new Person("Vinay", "Bonu", 26),
			new Person("Tuchaar", "Gupta", 26)
		);
		
		// First Stream
		Stream<Person> personStream = personList.stream();
		// Transformation filter
		Stream<Person> filteredPersonStream = 
					personStream.filter((p) -> (p.getLastName().length() > 4));
		// Termination count
		long filteredOutput = filteredPersonStream.count();
		System.out.println(filteredOutput);
		/**************************************************************************/
		
		// Second Stream - Transformation(.stream()) and Termination(.max(...)
		Optional<Person> optional1 = personList.stream().
				max((p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()) );
		Person person1 = optional1.orElse(new Person());
		System.out.println(person1.getFirstName());
		/**************************************************************************/
		
		// How to handle alternative if there is no value
		// Third Stream - empty stream
		Stream<Person> personStream2 = Stream.empty();
		// Transformation(.stream()) and Termination(.max(...)
		Optional<Person> optional2 = personStream2.
				max( (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()) );
		Person person2 = optional2.orElse(new Person("", "", 0));
		Person person2_2 = optional2.orElseGet( () -> new Person("Dummy", "", 0) );
		Person person2_3 = null;
		try {
			person2_3 = optional2.orElseThrow(() -> new IllegalStateException());
		} catch (IllegalStateException exp) {}
		
		// Expected empty String
		System.out.println(person2.getFirstName());
		// Expected 'Dummy'
		System.out.println(person2_2.getFirstName());
		// Excepted null as reference does not initialized as it is throwing exception
		System.out.println(person2_3);
		/**************************************************************************/
		
		// how to consume if value is present
		ArrayList<Person> validatePersonList = new ArrayList<>(personList);
		
		Stream<Person> stream4 = personList.stream();
		Optional<Person> optional4 = stream4.filter( (p) -> p.getFirstName().startsWith("V") ).
				findFirst();
		// if this is a correct way to do closures.
		optional4.ifPresent( (p) -> validatePersonList.remove(p));// Consumer
		System.out.println(validatePersonList);
		/**************************************************************************/
		
		// map function of stream
		// It return stream of type returned by function acted on each element
		Stream<Person> stream5 = personList.stream();
		Stream<String> lowerNameStream = 
				stream5.map( (Person p) -> p.getFirstName().toLowerCase() );
		String[] lowerCaseName1 = lowerNameStream.toArray( String[]::new );
		System.out.println(Arrays.toString(lowerCaseName1));
		/**************************************************************************/
		
		// forEach Stream
		Stream<Person> stream6 = personList.stream();
		stream6.forEach( (Person p) -> { 
			int i = p.getAge() + 10 ;
		});
		/**************************************************************************/
		
		// Supplier Interface
		Supplier<String> supplier = () -> "Vipul".toLowerCase(); 
		System.out.println(supplier.get());
	}
}
