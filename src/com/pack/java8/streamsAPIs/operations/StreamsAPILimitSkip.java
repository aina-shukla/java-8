package com.pack.java8.streamsAPIs.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsAPILimitSkip {

	// creates sub-streams
	// limit() - limits the n numbers of elements to be processed

	public static Optional<Integer> limit(List<Integer> listInt) {
		return listInt.stream().limit(3).reduce((x, y) -> x + y);
	}

	// skips() - skips n number of elements in stream

	public static Optional<Integer> skip(List<Integer> listInt) {
		return listInt.stream().skip(2).reduce((x, y) -> x + y);
	}

	public static void main(String[] args) {

		List<Integer> listInt = Arrays.asList(2, 5, 1, 8, 9);
		System.out.println(limit(listInt));
		System.out.println(skip(listInt));

	}

}
