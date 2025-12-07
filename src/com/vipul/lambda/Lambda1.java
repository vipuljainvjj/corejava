package com.vipul.lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lambda1 {
	
	public static void main(String[] args) {
		
		Consumer<String> consumer = s -> {
			
		};
		myMethod(consumer, "12345");
		
		Integer myVar = new Integer(43);
	    Supplier<Integer> lambdaFun = () -> {
	    	return myVar;
	    }; // error
	    System.out.println(lambdaFun.get());
		
		
	}
	
	static void myMethod(Consumer<String> consumer, String s) {
		consumer.accept(s);
	}

}
