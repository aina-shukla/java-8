package com.pack.java8.streamsAPIs.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsAPIMinUsingReduce {

	public static Optional<Integer> findMinValue(List<Integer> listInt) {
		return listInt.stream().reduce( (x, y) -> x < y ? x : y);
	}

	public static void main(String[] args) {

		List<Integer> listInt = Arrays.asList(2, 4, 5, 1, 7);
		Optional<Integer> max = findMinValue(listInt);
		System.out.println(max);

	}

}
