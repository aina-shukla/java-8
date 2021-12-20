package com.pack.java8.defaultAndStaticMethods;

import java.util.Arrays;
import java.util.List;

public class MultiplyMain {

	public static void main(String[] args) {

		Multiply mul = new MultiplyImpl();
		List<Integer> listInt = Arrays.asList(2,4);
		System.out.println(mul.multiply(listInt));
	}

}
