package com.pack.java8.streamsAPIs.optionals;

import java.util.Optional;

public class PresentMethods {
	
	public static void main(String[] args) {

		Optional<String> optional = Optional.ofNullable("Hello");
		System.out.println(optional.isPresent());
		
		if(optional.isPresent())
			System.out.println(optional.get());
		
		optional.ifPresent(s -> System.out.println(s));
	}

}
