package com.pack.java8.dateTimeAPIs;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeConversionsExample {

	public static void main(String args[]) {

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

		ZonedDateTime dateTime = localDateTime.atZone(ZoneId.of("Asia/Calcutta"));
		System.out.println(dateTime);

		System.out.println(Instant.now().atZone(ZoneId.of("Asia/Calcutta")));

	}
}
