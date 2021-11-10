package com.pack.java8.lambda;

public class RunnableLambdaExample {

	public static void main(String args[]) {

		// prior java 8

		Runnable runObj = new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside runnable - prior java 8");
			}
		};

		new Thread(runObj).start();

		// java 8 lambda

		// ()->{};

		Runnable runLambdaObj = () -> { // boiler plate code removed, more readable code
			System.out.println("Inside runnable using lambda - 1");
		};

		new Thread(runLambdaObj).start();

		// legacy way

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Legacy way");

			}
		}).start();

		// new way

		new Thread(() -> System.out.println("Inside runnable using lambda - 2")).start();

	}
}
