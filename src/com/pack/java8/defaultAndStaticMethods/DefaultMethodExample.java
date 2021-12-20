package com.pack.java8.defaultAndStaticMethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample {

	public static void main(String[] args) {

		List<String> li = Arrays.asList("Adam", "Eric", "Kathy");

		// prior java 8
		Collections.sort(li);
		System.out.println("Sorted order using collections " + li);

		// afterjava 8
		li.sort(Comparator.naturalOrder());
		System.out.println("Sorted using java 8" + li);
		
		li.sort(Comparator.reverseOrder());
		System.out.println("Reverse order "+li);

	}

}
