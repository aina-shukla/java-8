package com.pack.java8.streamsAPIs.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsAPIFindAnyAndFindFirst {

	// used to find an element in the stream
	// output is optional

	public static Optional<Integer> findAny(List<Integer> liInt) {
		return liInt.stream().filter(li -> li > 2).findAny();
	}

	public static Optional<Integer> findFirst(List<Integer> liInt) {
		return liInt.stream().filter(li -> li > 4).findFirst();
	}

	public static void main(String[] args) {

		List<Integer> liInt = Arrays.asList(2, 5, 1, 2, 3, 6);
		System.out.println("find any - " + findAny(liInt));
		System.out.println("find first - " + findFirst(liInt));
	}

}
