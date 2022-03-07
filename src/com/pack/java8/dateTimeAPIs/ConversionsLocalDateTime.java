package com.pack.java8.dateTimeAPIs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ConversionsLocalDateTime {

	public static void main(String[] args) {
		// LocalDate

		LocalDate localDate = LocalDate.of(2019, 07, 20);
		System.out.println("atTime - "+localDate.atTime(23,12,59));

		// LocalTime

		LocalTime localTime = LocalTime.of(23,16,30);
		System.out.println("atDate - "+localTime.atDate(localDate));

		// LocalDateTime

		LocalDateTime localDateTime = localTime.atDate(localDate);
		System.out.println("toLocalDate - "+localDateTime.toLocalDate());
		System.out.println("toLocalTime - "+localDateTime.toLocalTime());

	}

}
