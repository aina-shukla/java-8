package com.pack.java8.streamsAPIs.terminalOperations;

import com.pack.java8.data.Student;
import com.pack.java8.data.StudentDataBase;
import static java.util.stream.Collectors.*;

public class SummingIntAveragingIntCollector {

	public static int summingIntExample() {
		return StudentDataBase.getAllStudents().stream().collect(summingInt(Student::getNoteBooks));
	}

	public static double averagingIntExample() {
		return StudentDataBase.getAllStudents().stream().collect(averagingInt(Student::getNoteBooks));
	}

	public static void main(String[] args) {
		System.out.println(summingIntExample());
		System.out.println(averagingIntExample());
	}

}
