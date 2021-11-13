package com.pack.java8.streamsAPIs.operations;

import java.util.List;
import java.util.stream.Collectors;
import com.pack.java8.data.Student;
import com.pack.java8.data.StudentDataBase;

public class StreamsAPIFlatMap {

	// Stream API flat map operations
	// flat map - convert one type of stream to another - different from
	// collection's map
	// takes in function as an input
	// used when each element in stream represents multiple elements like list ,
	// arrays

	// toList() - printing activities from student database
	public static List<String> printStudentActivities() {
		List<String> listStudents = StudentDataBase.getAllStudents().stream().
		// student as an input -> student activities
				map(Student::getActivities).// stream List <string>
				flatMap(List::stream). // to flatten the stream
				collect(Collectors.toList());
		return listStudents;
	}

	public static void main(String[] args) {

		System.out.println("Activities - " + printStudentActivities());
	}

}
