package com.pack.java8.lambdaAndFuctionalInterface;

import java.util.List;
import java.util.function.Predicate;

import com.pack.java8.data.Student;
import com.pack.java8.data.StudentDataBase;

public class PredicateInterfaceExample2 {

	// Student class example

	static Predicate<Student> predStudent = (s) -> s.getGradeLevel() >= 3;

	static Predicate<Student> predStudent1 = (s) -> s.getGpa() >= 3.9;

	public static void filterStudentsByGradeLevel() {
		List<Student> listStudents = StudentDataBase.getAllStudents();
		listStudents.forEach(student -> {

			if (predStudent.test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void filterStudentsByGPA() {
		System.out.println("filterStudentsByGPA---------");
		List<Student> listStudents = StudentDataBase.getAllStudents();
		listStudents.forEach(student -> {

			if (predStudent1.test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void filterStudents() {
		System.out.println("filterStudents---------");
		List<Student> listStudents = StudentDataBase.getAllStudents();
		listStudents.forEach(student -> {

			if (predStudent1.and(predStudent1).test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void main(String[] args) {
		filterStudentsByGradeLevel();
		filterStudentsByGPA();
		filterStudents();
	}

}
