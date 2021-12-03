package com.pack.java8.streamsAPIs.terminalOperations;

import java.util.List;
import java.util.stream.Collectors;
import com.pack.java8.data.Student;
import com.pack.java8.data.StudentDataBase;

import static java.util.stream.Collectors.*;

public class MappingCollector {

	public static void main(String[] args) {

		List<String> namesList = StudentDataBase.getAllStudents().stream()
				.collect(mapping(Student::getName, Collectors.toList()));
		System.out.println(namesList);
	}

}
