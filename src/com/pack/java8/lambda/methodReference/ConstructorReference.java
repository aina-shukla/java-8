package com.pack.java8.lambda.methodReference;

import java.util.function.Function;
import java.util.function.Supplier;
import com.pack.java8.data.Student;

public class ConstructorReference {

	// introduced in java 8
	// syntax is ClassName::new;
	// only used for functional interfaces

	static Supplier<Student> studentSupplier = Student::new;

	static Function<String, Student> studentFunction = Student::new;

	// Student student = Student::new;

	public static void main(String[] args) {
		System.out.println(studentSupplier.get());
		System.out.println(studentFunction.apply("Client123"));
	}
}