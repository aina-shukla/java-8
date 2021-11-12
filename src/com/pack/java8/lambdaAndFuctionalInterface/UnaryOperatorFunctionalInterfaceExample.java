package com.pack.java8.lambdaAndFuctionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorFunctionalInterfaceExample {

	// unary operator functional interface
	// extends function interface

	// this can be used when input and output are of same type, instead of function
	// interface

	static UnaryOperator<String> unaryObj = (s) -> s.concat("java8");

	public static void main(String[] args) {
		System.out.println(unaryObj.apply("hello"));

	}

}
