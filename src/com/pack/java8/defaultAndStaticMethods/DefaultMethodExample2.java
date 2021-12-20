package com.pack.java8.defaultAndStaticMethods;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import com.pack.java8.data.Student;
import com.pack.java8.data.StudentDataBase;

public class DefaultMethodExample2 {

	static Consumer<Student> consumerStudent = (s -> System.out.println(s));

	public static void sortByName(List<Student> li) {
		System.out.println("...........");
		Comparator<Student> compObj = Comparator.comparing(Student::getName);
		li.sort(compObj);
		li.forEach(consumerStudent);
	}

	public static void main(String[] args) {

		List<Student> student = StudentDataBase.getAllStudents();
		// System.out.println(student);
		student.forEach(consumerStudent);

		sortByName(student);
	}

}
