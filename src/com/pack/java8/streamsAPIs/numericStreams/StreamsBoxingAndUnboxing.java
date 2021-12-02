package com.pack.java8.streamsAPIs.numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsBoxingAndUnboxing {

	// Boxing - converting primitve to wrapper class type , int -> Integer
	// Unboxing - converting wrapper to primitve type , Integer -> int

	public static List<Integer> boxing() {
		return IntStream.rangeClosed(1, 10). // int output
				boxed(). // converting to Integer
				collect(Collectors.toList());
	}

	public static int unboxing(List<Integer> listInt) {
		return listInt.stream(). // wrapper Integer values
				mapToInt(Integer::intValue). // converting Integer to int
				sum();
	}

	public static void main(String[] args) {
		System.out.println("Boxing " + boxing());

		List<Integer> listInt = boxing();
		System.out.println("Unboxing " + unboxing(listInt));
	}

}
