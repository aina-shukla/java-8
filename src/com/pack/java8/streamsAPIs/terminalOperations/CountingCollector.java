package com.pack.java8.streamsAPIs.terminalOperations;

import java.util.stream.Collectors;
import com.pack.java8.data.StudentDataBase;

public class CountingCollector  {

	// counting() - returns total no of elements as a result

	public static long counting() {
		return StudentDataBase.getAllStudents().stream().filter(s -> s.getGpa() >= 3.9).collect(Collectors.counting());
	}

	public static void main(String[] args) {
		System.out.println("Count is " + counting());
	}

}
