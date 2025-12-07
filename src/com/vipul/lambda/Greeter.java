package com.vipul.lambda;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		HelloWorldGreeting greeter = new HelloWorldGreeting();
		greeter.perform();
		
		// Equivalent Lambda Expression for Above functionality
		Greeting greetingLambda = () -> System.out.print("My Lambda");
		greetingLambda.perform();
		
		
		
		
		
	} 

}
