package com.pack.java8.streamsAPIs.operations;

import java.util.List;
import java.util.stream.Collectors;

import com.pack.java8.data.Student;
import com.pack.java8.data.StudentDataBase;

public class StreamsAPIFilter {

	// filter() - filters the elements in the stream
	// input is predicate funtional interfaces

	public static List<Student> filterStudents() {

		List<Student> listStudent = StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGradeLevel() >= 3)
				.filter(student -> student.getGender().equals("female"))
				.collect(Collectors.toList());
		return listStudent;

	}

	public static void main(String[] args) {

		System.out.println(filterStudents());
	}

}
