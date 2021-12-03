package com.pack.java8.streamsAPIs.terminalOperations;

import java.util.stream.Collectors;
import com.pack.java8.data.Student;
import com.pack.java8.data.StudentDataBase;

public class JoiningCollector {

	// collect() takes input of type collector
	// joining() concatenates string on the elements of the stream
	// joining() has 3 versions

	// version 1
	public static String joining_1() {
		return StudentDataBase.getAllStudents().stream().map(Student::getName) // stream of strings
				.collect(Collectors.joining());
	}

	// version 2
	public static String joining_2() {
		return StudentDataBase.getAllStudents().stream().map(Student::getName) // stream of strings
				.collect(Collectors.joining("-")); // delimiter
	}

	// version 3
	public static String joining_3() {
		return StudentDataBase.getAllStudents().stream().map(Student::getName) // stream of strings
				.collect(Collectors.joining("-", "(", ")")); // delimiter
	}

	public static void main(String[] args) {
		System.out.println("Concatenated version 1 - " + joining_1());
		System.out.println("Concatenated version 2 -" + joining_2());
		System.out.println("Concatenated version 3 -" + joining_3());
	}

}
