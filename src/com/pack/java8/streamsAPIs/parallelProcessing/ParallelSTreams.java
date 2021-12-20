package com.pack.java8.streamsAPIs.parallelProcessing;

import java.util.stream.IntStream;

public class ParallelSTreams {

	public static int sum_sequential_streams() {

		return IntStream.rangeClosed(0, 10000).sum();
	}

	public static int sum_parallel_streams() {

		return IntStream.rangeClosed(0, 10000).parallel().sum();

	}

	public static void main(String[] args) {

		System.out.println(sum_sequential_streams());
		System.out.println(sum_parallel_streams());
	}

}
