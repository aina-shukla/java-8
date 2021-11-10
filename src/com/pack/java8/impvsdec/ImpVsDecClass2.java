package com.pack.java8.impvsdec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImpVsDecClass2 {

	public static void main(String[] args) {
		// Imperative v/s Declarative programming example 2

		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 4, 5, 5, 6, 7, 7, 8, 9, 9);

		// Remove the duplicates from the list.

		/**
		 * Imperative Style
		 */
		List<Integer> uniqueList = new ArrayList<>();
		for (Integer i : integerList)
			if (!uniqueList.contains(i)) {
				uniqueList.add(i);
			}
		System.out.println("unique List : " + uniqueList);

		/**
		 * Declarative Style
		 */

		List<Integer> uniqueList1 = integerList.stream().distinct().collect(Collectors.toList());

		System.out.println("unique List1 : " + uniqueList1);
	}

}