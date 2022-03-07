package com.pack.java8.dateTimeAPIs;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {

		ZonedDateTime dateTime = ZonedDateTime.now();
		System.out.println(dateTime);
		System.out.println("getOffset - "+dateTime.getOffset());
		System.out.println("getZone - "+dateTime.getZone());
		dateTime.getZone().getAvailableZoneIds().stream().forEach(z-> System.out.println(z));
		System.out.println("getAvailableZoneIds - "+dateTime.getZone().getAvailableZoneIds().size());
		
		System.out.println("Zoned date time--"+ZonedDateTime.now(ZoneId.of("Asia/Calcutta")));
		System.out.println("Zoned date time--"+ZonedDateTime.now(ZoneId.of("Asia/Tokyo")));
		System.out.println("Zoned date time--"+ZonedDateTime.now(ZoneId.of("Asia/Singapore")));
		System.out.println("Zoned date time--"+ZonedDateTime.now(ZoneId.of("Asia/Srednekolymsk")));

		System.out.println("Clock.system - "+ZonedDateTime.now(Clock.system(ZoneId.of("Asia/Calcutta"))));
		
		LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Calcutta"));
		System.out.println(localDateTime);
		
		LocalDateTime localDateTime1 = LocalDateTime.now(Clock.system(ZoneId.of("Asia/Calcutta")));
		System.out.println(localDateTime1);

	}

}
