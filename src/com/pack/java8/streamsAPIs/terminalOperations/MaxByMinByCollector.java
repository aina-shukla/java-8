package com.pack.java8.streamsAPIs.terminalOperations;

import java.util.Comparator;
import java.util.Optional;
import static java.util.stream.Collectors.*;
import com.pack.java8.data.Student;
import com.pack.java8.data.StudentDataBase;

public class MaxByMinByCollector {

	// comparator as input, optional as output

	public static Optional<Student> minByExample() {
		return StudentDataBase.getAllStudents().stream().collect(minBy(Comparator.comparing(Student::getGpa)));
	}

	public static Optional<Student> maxByExample() {
		return StudentDataBase.getAllStudents().stream().collect(maxBy(Comparator.comparing(Student::getGpa)));
	}

	public static void main(String[] args) {
		System.out.println(minByExample());
		System.out.println(maxByExample());
	}

}