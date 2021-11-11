package com.pack.java8.lambdaAndFuctionalInterface;

import java.util.List;
import java.util.function.BiConsumer;

import com.pack.java8.data.Student;
import com.pack.java8.data.StudentDataBase;

public class BiConsumerInterfaceExample {

	// bi-consumer

	// accepts 2 inputs, doesn't return anything

	// extension to consumer

	public static void printNameAndActivities() {
		BiConsumer<String, List<String>> biConObj = (name, activities) -> System.out
				.println("name - " + name + ", activities " + activities);
		List<Student> li = StudentDataBase.getAllStudents();
		li.forEach((s) -> biConObj.accept(s.getName(), s.getActivities()));
	}

	public static void main(String[] args) {
		BiConsumer<String, String> biCon = (a, b) -> System.out.println("a : " + a + " and b : " + b);

		biCon.accept("java 8", "java 11");

		BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("product  is : " + (a * b));
		BiConsumer<Integer, Integer> add = (a, b) -> System.out.println("addition  is : " + (a + b));
		BiConsumer<Integer, Integer> division = (a, b) -> System.out.println("division  is : " + (a / b));
		multiply.andThen(add).andThen(division).accept(2, 3); // consumer chaining
		printNameAndActivities();
	}

}
