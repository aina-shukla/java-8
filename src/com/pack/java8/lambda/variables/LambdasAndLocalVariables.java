package com.pack.java8.lambda.variables;

import java.util.function.Consumer;

public class LambdasAndLocalVariables {

// this concept is called effectively final, as the value of local variable can't be changed

	public static void main(String[] args) {

		int i = 0; // local variable

		// not allowed to use local var in lambda exp name or body

//		Consumer<Integer> conObj = (i1) -> {  //compilation issue as i is reused , issues with local variable
//			int i=2;                          // doesn't allow new value/reassign , issues with local variable
//			System.out.println(i);
//		};
	}

}