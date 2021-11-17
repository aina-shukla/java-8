package com.pack.java8.streamsAPIs.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.pack.java8.data.Student;
import com.pack.java8.data.StudentDataBase;

public class StreamAPIReduce {

	// reduce - terminal operation
	// it reduces the contents of stream to a single value
	// two params input - default/initial and binaryoperator

	public static int performMultiplicationWithoutIdentitiy(List<Integer> li) {
		return li.stream().reduce(1, (a, b) -> (a * b));

	}

	// optional
	public static Optional<Integer> performMultiplication(List<Integer> li) {
		return li.stream().reduce((a, b) -> (a * b));

	}

	public static Optional<Student> highestGPA() {

		return StudentDataBase.getAllStudents().stream().reduce((a, b) -> (a.getGpa() > b.getGpa() ? a : b)
		// {
//			if (a.getGpa() > b.getGpa()) {
//				return a;
//			} else
//				return b;
//		}
		);
	}

	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(1, 3, 5, 7);
		System.out.println(performMultiplicationWithoutIdentitiy(li));

		// optional
		System.out.println("optional  -------------");
		Optional<Integer> result = performMultiplication(li);
		System.out.println(result);
		System.out.println(result.isEmpty());
		System.out.println(result.isPresent());

		// student
		System.out.println("student db -------------");
		Optional<Student> res = highestGPA();
		if (res.isPresent())
			System.out.println(res.get());
	}

}
