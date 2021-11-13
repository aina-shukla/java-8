package com.pack.java8.streamsAPIs;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import com.pack.java8.data.Student;
import com.pack.java8.data.StudentDataBase;

public class StreamAPIExample {

	// Streams are fixed, can't be modified or add data like collections

	// Elements can be accessed only in sequence, not like collections in any order
	
	// Streams can be traversed only once

	public static void main(String[] args) {

		// student class - students name and activities in a map

		Map<String, List<String>> mapObj = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.toMap(Student::getName, Student::getActivities));

		System.out.println(mapObj);

		// filter operation

		System.out.println("Stream Filter operation------");

		Map<String, List<String>> mapObjFilter = StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGradeLevel() >= 3)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));

		System.out.println(mapObjFilter);

		// filter operation using predicate

		System.out.println("Stream Filter operation using predicate interface------");

		Predicate<Student> predObj = student -> student.getGradeLevel() >= 3;
		Map<String, List<String>> mapObjFilterUsingPredicate = StudentDataBase.getAllStudents().stream().filter(predObj)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));

		System.out.println(mapObjFilterUsingPredicate);

		// chaining filter operation using predicate

		System.out.println("Stream chaining Filter operation using predicate interface------");

		Predicate<Student> predObj2 = student -> student.getGpa() >= 3.9;
		Map<String, List<String>> mapObjFilterUsingPredicate1 = StudentDataBase.getAllStudents().stream()
				.filter(predObj).filter(predObj2).collect(Collectors.toMap(Student::getName, Student::getActivities)); // chaining
																														// filter

		System.out.println(mapObjFilterUsingPredicate1);

	}

}