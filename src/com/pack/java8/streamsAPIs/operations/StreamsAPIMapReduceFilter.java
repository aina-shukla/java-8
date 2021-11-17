package com.pack.java8.streamsAPIs.operations;

import com.pack.java8.data.Student;
import com.pack.java8.data.StudentDataBase;

public class StreamsAPIMapReduceFilter {

	private static int getNotebooks() {
		
		// map and reduce
		
		// way 1
		// return
		// StudentDataBase.getAllStudents().stream().map(Student::getNoteBooks).reduce(0,
		// (a, b) -> a + b);

		// way 2
		// return
		// StudentDataBase.getAllStudents().stream().map(Student::getNoteBooks).reduce(0,
		// Integer::sum);

		// filter, map, reduce
		return StudentDataBase.getAllStudents().stream().filter((student -> student.getGradeLevel() >= 3))
				.map(Student::getNoteBooks).reduce(0, Integer::sum);

	}

	public static void main(String[] args) {
		System.out.println(getNotebooks());
	}
}