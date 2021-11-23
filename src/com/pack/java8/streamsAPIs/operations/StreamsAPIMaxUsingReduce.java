package com.pack.java8.streamsAPIs.operations;

import java.util.Arrays;
import java.util.List;

public class StreamsAPIMaxUsingReduce {

	public static int findMaxValue(List<Integer> listInt) {
		return listInt.stream().reduce(0, (x, y) -> x > y ? x : y);
	}

	public static void main(String[] args) {

		List<Integer> listInt = Arrays.asList(2, 4, 5, 1, 7);
		int max = findMaxValue(listInt);
		System.out.println(max);

	}

}
