package com.pack.java8.streamsAPIs.operations;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.pack.java8.data.Student;
import com.pack.java8.data.StudentDataBase;

public class StreamsAPIMap {

	// Stream API map operations
	// map - convert one type of stream to another - different from collection's map
	// takes in function as an input

	// toList()
	public static List<String> nameList() {
		List<String> listStudents = StudentDataBase.getAllStudents().stream().
		// student as an input -> student name
				map(Student::getName).// stream <string>
				map(String::toUpperCase). // chaining , converting to uppercase, performing some operation on string
											// input
				collect(Collectors.toList());
		return listStudents;
	}

	// toSet()
	public static Set<String> nameSet() {
		Set<String> setStudents = StudentDataBase.getAllStudents().stream().
		// student as an input -> student name
				map(Student::getName).// stream <string>
				map(String::toUpperCase). // chaining , converting to uppercase, performing some operation on string
											// input
				collect(Collectors.toSet());
		return setStudents;
	}

	public static void main(String[] args) {

		System.out.println("List - " + nameList());
		System.out.println("Set - " + nameSet());
	}

}
