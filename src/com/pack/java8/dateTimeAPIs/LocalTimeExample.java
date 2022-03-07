package com.pack.java8.dateTimeAPIs;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

	public static void main(String[] args) {
		// LocalTime

		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);

		LocalTime localTime1 = LocalTime.of(2, 30, 59);
		System.out.println("hour-min-sec " + localTime1);

		LocalTime localTime2 = LocalTime.of(2, 30, 59, 889);
		System.out.println("hour-min-sec-nanosec " + localTime2);

		LocalTime localTime3 = LocalTime.of(2, 30);
		System.out.println("hour-min " + localTime3);

		/*
		 * getting the values from local time instance
		 */
		System.out.println("getHour - " + localTime.getHour());
		System.out.println("getMinute - " + localTime.getMinute());
		System.out.println("getSecond - " + localTime.getSecond());
		System.out.println("getNano - " + localTime.getNano());
		System.out.println("getClass - " + localTime.getClass());
		System.out.println("MINUTE_OF_DAY - " + localTime.get(ChronoField.MINUTE_OF_DAY));
		System.out.println("CLOCK_HOUR_OF_DAY - " + localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
		System.out.println("MINUTE_OF_DAY - " + localTime.getLong(ChronoField.MINUTE_OF_DAY));
		System.out.println("toSecondOfDay - " + localTime.toSecondOfDay()); // shows time in seconds

		/*
		 * Modify localTime instance
		 */
		System.out.println("plusHours - " + localTime.plusHours(2));
		System.out.println("plusMinutes - " + localTime.plusMinutes(12));

		System.out.println("minusHours - " + localTime.minusHours(2));
		System.out.println("minusMinutes - " + localTime.minusMinutes(24));
		System.out.println("minusMinutes - " + localTime.minus(24, ChronoUnit.MINUTES));
		System.out.println("minusSeconds - " + localTime.minusSeconds(29));
		System.out.println("minusNanos - " + localTime.minusNanos(288889));

		System.out.println("withHour - " + localTime.withHour(22));
		System.out.println("withMinute - " + localTime.withMinute(22));

		/*
		 * Additional support methods
		 */
		System.out.println("isBefore - " + localTime.isBefore(localTime1));
		System.out.println("isAfter - " + localTime.isAfter(localTime1));
	}

}
