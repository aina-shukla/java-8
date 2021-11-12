package com.pack.java8.lambdaAndFuctionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BinaryOperatorFunctionalInterfaceExample {

	// unary operator functional interface
	// extends bi-function interface
	// two inputs, one output
	// this can be used when input and output are of same type, instead of function
	// interface

	static BinaryOperator<Integer> binaryObj = (a, b) -> a * b;

	static Comparator<Integer> comObj = (a, b) -> a.compareTo(b);

	public static void main(String[] args) {
		System.out.println("Product is " + binaryObj.apply(2, 3));

		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comObj);
		System.out.println("Maximum is " + maxBy.apply(2, 3));

		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comObj);
		System.out.println("Minimum is " + minBy.apply(2, 3));

	}

}
