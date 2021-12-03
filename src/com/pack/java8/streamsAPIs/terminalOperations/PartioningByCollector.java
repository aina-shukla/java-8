package com.pack.java8.streamsAPIs.terminalOperations;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import static java.util.stream.Collectors.*;
import com.pack.java8.data.Student;
import com.pack.java8.data.StudentDataBase;

public class PartioningByCollector {

	// inpur predicate, output map

	public static void partitionByExample() {
		Predicate<Student> gpaPred = s -> s.getGpa() > -3.9;
		Map<Boolean, List<Student>> mapObj = StudentDataBase.getAllStudents().stream().collect(partitioningBy(gpaPred));
		System.out.println(mapObj);
	}

	public static void main(String[] args) {
		partitionByExample();
	}

}
