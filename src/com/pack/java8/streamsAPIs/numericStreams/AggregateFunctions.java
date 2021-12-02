package com.pack.java8.streamsAPIs.numericStreams;

import java.util.stream.IntStream;

public class AggregateFunctions {

	// sum(), max(), min(), average()
	
	public static void main(String[] args) {

		System.out.println("Sum is "+IntStream.rangeClosed(1, 50).sum());
		System.out.println("Max is "+IntStream.rangeClosed(1, 50).max());
		System.out.println("Min is "+IntStream.rangeClosed(1, 50).min());
		System.out.println("Average is "+IntStream.rangeClosed(1, 50).average());

	}

}
