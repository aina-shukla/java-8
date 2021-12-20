package com.pack.java8.streamsAPIs.optionals;

import java.util.Optional;

public class OptionalMethods {

	public static Optional<String> ofNullable() {

		Optional<String> stringOptional = Optional.ofNullable("Hello");
		return stringOptional;
	}

	public static Optional<String> ofMethod() {

		Optional<String> stringOptional = Optional.of("Hello");
		return stringOptional;
	}

	public static Optional<String> empty() {

		Optional<String> stringOptional = Optional.empty();
		return stringOptional;
	}

	public static void main(String[] args) {
		System.out.println(ofNullable().isPresent());
		System.out.println(ofMethod().isPresent());
		System.out.println(empty().isPresent());
		System.out.println(ofNullable());
		System.out.println(ofMethod());
		System.out.println(empty());
	}

}
