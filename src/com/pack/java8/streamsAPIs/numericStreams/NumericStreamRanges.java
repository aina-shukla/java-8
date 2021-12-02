package com.pack.java8.streamsAPIs.numericStreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRanges {

	// Intstream.range(1,50) -> 1 to 49
	// Intstream.rangeClosed(1,50) -> 1 to 50
	// same for longstream
	// doublestream doesnot support these two ranges

	public static void main(String[] args) {

		IntStream intStream = IntStream.range(1, 50);
		System.out.println("Range count " + intStream.count());
		IntStream.range(1, 50).forEach(value -> System.out.print(value + "-"));
		System.out.println();

		IntStream intstream = IntStream.rangeClosed(1, 50);
		System.out.println("Range closed count " + intstream.count());
		IntStream.rangeClosed(1, 50).forEach(value -> System.out.print(value + "-"));
		System.out.println();

		LongStream longStream = LongStream.rangeClosed(1, 50);
		System.out.println("Long Range closed count " + longStream.count());

		// doublestream doesnot support these two ranges
		IntStream.range(1, 50).asDoubleStream().forEach(value -> System.out.println(value + "-"));
	}

}
