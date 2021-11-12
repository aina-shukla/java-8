package com.pack.java8.lambda.methodReference;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

	static Consumer<String> c1 = (str) -> System.out.println(str.toUpperCase());
	static Consumer<String> c2 = System.out::println;

	public static void main(String[] args) {
		c1.accept("java8");
		c2.accept("java8");
	}

}
