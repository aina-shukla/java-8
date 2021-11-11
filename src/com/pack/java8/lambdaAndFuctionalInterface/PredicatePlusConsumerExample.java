package com.pack.java8.lambdaAndFuctionalInterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import com.pack.java8.data.Student;
import com.pack.java8.data.StudentDataBase;

public class PredicatePlusConsumerExample {

	// Predicate Plus Consumer Interface Example
	Predicate<Student> predicateStudent1 = (s) -> s.getGradeLevel() >= 3;
	Predicate<Student> predicateStudent2 = (s) -> s.getGpa() >= 3.9;
	BiConsumer<String, List<String>> biConsumerStudent = (name, activities) -> System.out
			.println("name - " + name + ", activities " + activities);

	Consumer<Student> consumerStudent = (student -> {
		if (predicateStudent1.and(predicateStudent2).test(student)) {
			biConsumerStudent.accept(student.getName(), student.getActivities());
		}
	});

	public void printNameAndActivity(List<Student> listStudents) {
		listStudents.forEach(consumerStudent);
	}

	public static void main(String[] args) {

		List<Student> listStudents = StudentDataBase.getAllStudents();
		new PredicatePlusConsumerExample().printNameAndActivity(listStudents);

	}

}
