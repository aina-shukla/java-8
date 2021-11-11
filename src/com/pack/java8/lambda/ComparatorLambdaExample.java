package com.pack.java8.lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		// prior java 8

		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};

		System.out.println("Result of comparator prior java 8 : " + comparator.compare(1, 2));

		// java 8

		// ()->{};

		Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> {
			return a.compareTo(b);
		};

		System.out.println("Result of comparator after java 8 :" + comparatorLambda.compare(7, 3));

		Comparator<Integer> comparatorLambda1 = (a, b) -> {
			return a.compareTo(b);
		};

		System.out.println("Result of comparator after java 8 :" + comparatorLambda1.compare(2, 2));

	}

}
