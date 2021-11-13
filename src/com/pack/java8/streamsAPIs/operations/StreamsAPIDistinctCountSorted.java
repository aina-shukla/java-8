package com.pack.java8.streamsAPIs.operations;

import java.util.List;
import java.util.stream.Collectors;
import com.pack.java8.data.Student;
import com.pack.java8.data.StudentDataBase;

public class StreamsAPIDistinctCountSorted {

	// distinct() - returns a steam with unique elements
	// sort() - sorts the stream elements
	// count() - returns a long with total number of elemnts in the stream

	// distinct()
	public static List<String> printStudentDistinctActivities() {
		List<String> distinctListActivities = StudentDataBase.getAllStudents().stream().
		// student as an input -> student activities
				map(Student::getActivities).// stream List <string>
				flatMap(List::stream).distinct(). // distinct
				collect(Collectors.toList());
		return distinctListActivities;
	}

	// sorted() and distinct()
	public static List<String> printStudentSortedActivities() {
		List<String> sortedListActivities = StudentDataBase.getAllStudents().stream().
		// student as an input -> student activities
				map(Student::getActivities).// stream List <string>
				flatMap(List::stream).distinct().sorted(). // distinct and sorted
				collect(Collectors.toList());
		return sortedListActivities;
	}

	// count() and distinct()
	public static long printStudentCountActivities() {
		long countActivities = StudentDataBase.getAllStudents().stream().
		// student as an input -> student activities
				map(Student::getActivities).// stream List <string>
				flatMap(List::stream).distinct().count();
		return countActivities;
	}

	public static void main(String[] args) {

		System.out.println("Distinct - " + printStudentDistinctActivities());
		System.out.println("Sorted - " + printStudentSortedActivities());
		System.out.println("Count - " + printStudentCountActivities());
	}

}
