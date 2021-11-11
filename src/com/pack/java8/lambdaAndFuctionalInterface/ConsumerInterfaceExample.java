package com.pack.java8.lambdaAndFuctionalInterface;

import java.util.List;
import java.util.function.Consumer;
import com.pack.java8.data.Student;
import com.pack.java8.data.StudentDataBase;

public class ConsumerInterfaceExample {

	// consumer functional interface

	// accepts something, returns nothing

	// to avoid duplications and errors
	static Consumer<Student> c2 = (student) -> System.out.println(student);
	static Consumer<Student> c3 = (student) -> System.out.print("Name : " + student.getName());
	static Consumer<Student> c4 = (student) -> System.out.println(", Activities : " + student.getActivities());

	public static void printName() {
		List<Student> list = StudentDataBase.getAllStudents();
		list.forEach(c2);
	}

	// consumer chaining
	public static void printNameAndActivities() {
		List<Student> list = StudentDataBase.getAllStudents();
		list.forEach(c3.andThen(c4)); // consumer chaining
	}

	// filtering
	public static void printNameAndActivitiesUsingCondition() {
		System.out.println("printNameAndActivitiesUsingCondition : ");
		List<Student> personList = StudentDataBase.getAllStudents();
		personList.forEach((s) -> {
			if (s.getGradeLevel() >= 3) {
				c3.andThen(c4).accept(s);
			}
		});
	}

	public static void main(String[] args) {

		Consumer<String> c1 = (str) -> System.out.println(str.toUpperCase());
		c1.accept("java 8");

		printName();
		printNameAndActivities();
		printNameAndActivitiesUsingCondition();
	}

}
