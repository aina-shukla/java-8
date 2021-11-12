package com.pack.java8.lambda.methodReference;

import java.util.function.Predicate;

public class RefactorLambdaToMethodReference {

	static Predicate<Integer> predObj = (in) -> in >= 3;

	public static boolean greaterThan(int in) {
		if (in >= 3)
			return true;
		else
			return false;
	}

	static Predicate<Integer> predObjMethodReference = RefactorLambdaToMethodReference::greaterThan; // using method
																										// reference

	public static void main(String[] args) {
		System.out.println("Initial : "+predObj.test(5));
		System.out.println("Checking using method reference : "+predObjMethodReference.test(5)); // checking method reference
	}

}
