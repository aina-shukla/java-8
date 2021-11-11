package com.pack.java8.lambdaAndFuctionalInterface;

import java.util.function.Predicate;

public class PredicateInterfaceExample1 {

	// accepts input, returns boolean

	static Predicate<Integer> predInt = (n) -> {
		return n % 2 == 0;
	};

	static Predicate<Integer> predInt1 = (n) -> n % 2 == 0;

	static Predicate<Integer> predInt2 = (n) -> n % 5 == 0;

	public static void predicateAndMethod() {
		System.out.println("predicateAndMethod-----");
		System.out.println(predInt1.and(predInt2).test(8)); // predicate and method chaining
	}

	public static void predicateOrMethod() {
		System.out.println("predicateOrMethod-----");
		System.out.println(predInt1.or(predInt2).test(8)); // predicate or method chaining
	}

	public static void predicateNegateMethod() {
		System.out.println("predicateNegateMethod-----");
		System.out.println(predInt1.or(predInt2).negate().test(8)); // predicate negate method chaining
	}

	public static void main(String[] args) {

		System.out.println(predInt.test(5));

		System.out.println(predInt1.test(4));

		predicateAndMethod();

		predicateOrMethod();
	
		predicateNegateMethod();
	}
}