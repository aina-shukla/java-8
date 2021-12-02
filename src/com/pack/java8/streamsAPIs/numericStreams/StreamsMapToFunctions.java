package com.pack.java8.streamsAPIs.numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsMapToFunctions {

	// maptoobj - convert numeric stream ele to obj
	// maptolong - covert numeric stream ele to long stream
	// maptodouble - covert numeric stream ele to double stream

	public static List<Integer> mapToObj() {
		List<Integer> integerList = IntStream.rangeClosed(1, 5).mapToObj((i) -> {
			return new Integer(i);
		}).collect(Collectors.toList());

		return integerList;
	}

	public static double mapToDouble() {

		return IntStream.rangeClosed(1, 5).mapToDouble((i) -> i).sum();

	}

	public static long mapToLong() {

		return IntStream.rangeClosed(1, 5).mapToLong((i) -> i).sum();

	}

	public static void main(String[] args) {

		System.out.println("mapToObj : " + mapToObj());

		System.out.println("mapToDouble() : " + mapToDouble());

		System.out.println("mapToLong() : " + mapToLong());

	}

}
