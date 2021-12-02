package com.pack.java8.streamsAPIs.numericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

	public static int sumOfNumbers(List<Integer> intList) {
		return intList.stream().reduce(0, (x, y) -> x + y); // unboxing to convert Integer to ints
	}

	public static int sumOfNNumbersIntStream() {
		return IntStream.rangeClosed(1, 6) // 1,2,3,4,5,6
				.sum();
	}

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(2, 3, 1, 4, 6, 5);
		System.out.println("sum is " + sumOfNumbers(intList));
		System.out.println(sumOfNNumbersIntStream());
	}

}
