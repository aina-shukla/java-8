package com.pack.java8.lambdaAndFuctionalInterface;

public class FunctionInterfaceExample2 {

	public static String performConcatMethod(String str) {
		return FunctionInterfaceExample1.functionObj2.apply(str);
	}

	public static void main(String[] args) {
		String result = performConcatMethod("hello");
		System.out.println(result);
	}

}
