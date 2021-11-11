package com.pack.java8.lambdaAndFuctionalInterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import com.pack.java8.data.Student;
import com.pack.java8.data.StudentDataBase;

public class BiPredicateExample {

	Predicate<Student> predicateStudent1 = (s) -> s.getGradeLevel() >= 3;
	Predicate<Student> predicateStudent2 = (s) -> s.getGpa() >= 3.9;

	BiPredicate<Integer, Double> biPredicateObj = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

	BiConsumer<String, List<String>> biConsumerStudent = (name, activities) -> System.out
			.println("name - " + name + ", activities " + activities);

	Consumer<Student> consumerStudent = (student -> {
		if (biPredicateObj.test(student.getGradeLevel(), student.getGpa())) {
			biConsumerStudent.accept(student.getName(), student.getActivities());
		}
	});

	public void printNameAndActivity(List<Student> listStudents) {
		listStudents.forEach(consumerStudent);
	}

	public static void main(String[] args) {
		List<Student> listStudents = StudentDataBase.getAllStudents();
		new BiPredicateExample().printNameAndActivity(listStudents);
	}

}
