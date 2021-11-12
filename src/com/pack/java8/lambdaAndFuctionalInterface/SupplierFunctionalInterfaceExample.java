package com.pack.java8.lambdaAndFuctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.pack.java8.data.Student;
import com.pack.java8.data.StudentDataBase;

public class SupplierFunctionalInterfaceExample {

	// supplier interface

	// only one method - get()

	// opposite of consumer interface - does not take an input but returns an output
	public static void main(String[] args) {

		Supplier<String> supplierObj1 = () -> {
			return "Hello";
		};

		System.out.println(supplierObj1.get());

		// student class example 1

		Supplier<Student> supplierObj = () -> {
			return new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball"));

		};
		System.out.println(supplierObj.get());

		// student class example 2

		Supplier<List<Student>> supplierStuObj = () -> StudentDataBase.getAllStudents();

		System.out.print(supplierStuObj.get());
	}
}
