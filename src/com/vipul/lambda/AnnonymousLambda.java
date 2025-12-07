package com.vipul.lambda;

public class AnnonymousLambda {
	
	public static void main(String[] args) {
		
		Thread annonyThread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Annoymous Thread");
			}
		});
		
		Runnable myRunnable = () -> System.out.println("Lambda Thread");
		Thread lambdaThread = new Thread(myRunnable);
		
		annonyThread.start();
		lambdaThread.start();
	}

}
