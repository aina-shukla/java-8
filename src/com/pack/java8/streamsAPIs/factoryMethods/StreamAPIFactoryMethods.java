package com.pack.java8.streamsAPIs.factoryMethods;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamAPIFactoryMethods {

	// of() - creates a stream of certain values passed
	// generate(), iterate() - creates infinite streams

	public static void main(String[] args) {

		// of
		Stream<String> names = Stream.of("adam", "julie", "naina");
		names.forEach(System.out::println);

		// iterate
		Stream.iterate(1, x -> x * 2).limit(10).forEach(System.out::println);

		// generate
		Supplier<Integer> supInt = new Random()::nextInt;
		Stream.generate(supInt).forEach(System.out::println);
	}

}