package com.pack.java8.lambda.methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

	static Function<String, String> input = (str) -> str.toUpperCase();

	static Function<String, String> inputMethodReference = String::toUpperCase; // using method reference

	public static void main(String[] args) {

		System.out.println(input.apply("java8"));
		System.out.println(inputMethodReference.apply("java8")); // checking method reference
	}

}
