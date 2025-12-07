package com.vipul.stream;

import com.vipul.data.Person;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamSorted {

	public static void main(String[] args) {
		Stream<Person> personStream = Stream.of(
				new Person("Vipul", 28),
				new Person("Mukul", 26),
				new Person("Vinay", 28),
				new Person("Shivam", 30),
				new Person("mayank", 28)
		);
		personStream.sorted(Comparator.comparing(person -> person.getFirstName().toUpperCase()))
					.forEach((person) -> System.out.println(person));
		//Consumer<T>
		
		Resource.use((Resource resource) -> {
			System.out.println(resource);
			resource.op1();
			resource.op2();
		});
	}
}

class Resource {
	private Resource() {}
	public void op1() { System.out.println("op1"); }
	public void op2() { System.out.println("op2"); }
	public void close() { System.out.println("close"); }
	public static void use (Consumer<Resource> block) {
		Resource resource = new Resource();
		System.out.println(resource);
		System.out.println(block);
		try {
			block.accept(resource);
		} finally {
			resource.close();
		}
	}

}