package com.pack.java8.dateTimeAPIs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeExample {

	public static void main(String[] args) {
		// LocalDate

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		// LocalTime

		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);

		// LocalDateTime
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

	}

}
