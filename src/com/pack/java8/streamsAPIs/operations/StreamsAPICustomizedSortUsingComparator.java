package com.pack.java8.streamsAPIs.operations;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import com.pack.java8.data.Student;
import com.pack.java8.data.StudentDataBase;

public class StreamsAPICustomizedSortUsingComparator {

	public static List<Student> sortStudentsByName() {

		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
	}

	public static List<Student> sortStudentsByGpa() {

		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa))
				.collect(Collectors.toList());
	}

	public static List<Student> sortStudentsByGpaReversed() {

		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {

		System.out.println("Students sorted by NAME");
		sortStudentsByName().forEach(System.out::println);

		System.out.println("Students sorted by GPA");
		sortStudentsByGpa().forEach(System.out::println);

		System.out.println("Students sorted by GPA Higher to Lower");
		sortStudentsByGpaReversed().forEach(System.out::println);

	}

}