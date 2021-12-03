package com.pack.java8.streamsAPIs.terminalOperations;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;
import com.pack.java8.data.Student;
import com.pack.java8.data.StudentDataBase;

public class GroupingByCollector {

	// equivalent to groupby operation in SQL
	// output is map
	// groups based on a property

	// one parameter version
	public static void groupBy1ArgumentVersion() {
		Map<String, List<Student>> mapObj = StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getGender));

		System.out.println(mapObj);
	}

	// one parameter version
	public static void customizedGroupExample() {
		Map<Object, List<Student>> mapObj = StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(s -> s.getGpa() >= 3.9 ? "Outstanding" : "Average"));

		System.out.println(mapObj);
	}

	// two parameter version
	public static void groupBy2ArgumentVersion() {
		Map<Object, Map<Object, List<Student>>> mapObj = StudentDataBase.getAllStudents().stream().collect(
				groupingBy(Student::getGradeLevel, groupingBy(s -> s.getGpa() >= 3.9 ? "Outstanding" : "Average")));

		System.out.println(mapObj);

	}

	public static void main(String[] args) {

		groupBy1ArgumentVersion();
		customizedGroupExample();
		groupBy2ArgumentVersion();
	}

}
