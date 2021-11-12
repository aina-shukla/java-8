package com.pack.java8.lambda.variables;

import java.util.function.Consumer;

public class LambdasAndInstanceVariables {

	static int j = 1; // instance variable

	public static void main(String[] args) {

		Consumer<Integer> conObj = (j) -> { // no issue with re-use of instance variable j
			j = 2; // no issue with reassigning of new value to instance variable j
			System.out.println(j);
		};
		
		conObj.accept(8);
	}

}