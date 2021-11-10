package com.pack.java8.impvsdec;

import java.util.stream.IntStream;

public class ImpVsDecClass1 {

	public static void main(String[] args) {
		// Imperative v/s Declarative programming example 1

		// sum of integers for the range from 0 to 100

		/**
		 * Imperative Style - how style of programming
		 */

		int sumI = 0;
		for (int i = 0; i <= 100; i++) {
			sumI += i;
		}

		System.out.println("sum using imperative approach is " + sumI);

		/**
		 * Declarative style. (Functional programming uses the same style) what style of
		 * programming. You let the system do the job for you and get the result.
		 */

		int sumD = IntStream.rangeClosed(0, 100).sum();
		System.out.println("sum using declarative approach is " + sumD);

	}

}