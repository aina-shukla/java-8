package com.pack.java8.lambdaAndFuctionalInterface;

import java.util.function.Function;

public class FunctionInterfaceExample1 {

	// Function interface

	// takes an input, returns output after processing

	// we can implement functionality as we do in java and assign that functionality
	// to variable

	static Function<String, String> functionObj = (name) -> name.toUpperCase();
	static Function<String, String> functionObj2 = (name) -> name.toUpperCase().concat("default");

	public static void main(String[] args) {

		System.out.println("result is " + functionObj.apply("java8"));
		System.out.println("result of concatenation is " + functionObj.andThen(functionObj2).apply("java8"));
		System.out.println("result of compose is " + functionObj.compose(functionObj2).apply("java8")); // first
																										// executes
																										// functionObj2
																										// and then
																										// functionObj

	}

}