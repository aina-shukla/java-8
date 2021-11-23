package com.pack.java8.streamsAPIs.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsAPIMatches {

	// allMatch, anyMatch, noneMatch
	// input is predicate, output is boolean

	public static boolean allMatch(List<Integer> liInt) {
		return liInt.stream().allMatch(lint -> lint > 4);
	}

	public static boolean anyMatch(List<Integer> liInt) {
		return liInt.stream().anyMatch(lint -> lint > 4);
	}

	public static boolean noneMatch(List<Integer> liInt) {
		return liInt.stream().noneMatch(lint -> lint > 4);
	}

	public static void main(String[] args) {

		List<Integer> liInt = Arrays.asList(2, 5, 1, 2, 3, 6);
		System.out.println("All match - " + allMatch(liInt));
		System.out.println("Any match - " + anyMatch(liInt));
		System.out.println("None match - " + noneMatch(liInt));

	}

}
