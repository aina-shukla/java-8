package com.pack.java8.dateTimeAPIs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		// LocalDateTime

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

		LocalDateTime localDateTime1 = LocalDateTime.of(2018, 03, 24, 11, 00, 00, 987000000);
		System.out.println(localDateTime1);

		LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println(localDateTime2);

		/*
		 * Getting time and date from localDateTime instance
		 */
		System.out.println("getHour - " + localDateTime.getHour());
		System.out.println("getMonth - " + localDateTime.getMonth());
		System.out.println("getDayOfMonth - " + localDateTime.getDayOfMonth());
		System.out.println("getDayOfYear - " + localDateTime.getDayOfYear());
		System.out.println("getMonthValue - " + localDateTime.getMonthValue());
		System.out.println("getYear - " + localDateTime.getYear());
		System.out.println("getChronology - " + localDateTime.getChronology());
		System.out.println("getDayOfWeek - " + localDateTime.getDayOfWeek());
		System.out.println("getClass - " + localDateTime.getClass());
		System.out.println("DAY_OF_MONTH - " + localDateTime.get(ChronoField.DAY_OF_MONTH));
		System.out.println("DAY_OF_MONTH - " + localDateTime.getLong(ChronoField.DAY_OF_MONTH));
		System.out.println("getHour - " + localDateTime.getHour());
		System.out.println("getMinute - " + localDateTime.getMinute());
		System.out.println("getSecond - " + localDateTime.getSecond());
		System.out.println("getNano - " + localDateTime.getNano());
		System.out.println("getClass - " + localDateTime.getClass());
		System.out.println("MINUTE_OF_DAY - " + localDateTime.get(ChronoField.MINUTE_OF_DAY));
		System.out.println("CLOCK_HOUR_OF_DAY - " + localDateTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
		System.out.println("MINUTE_OF_DAY - " + localDateTime.getLong(ChronoField.MINUTE_OF_DAY));

		/*
		 * Modify localDateTime instance
		 */
		System.out.println("Withyear - " + localDateTime.withYear(2019));
		System.out.println("Withdayofyear - " + localDateTime.withDayOfYear(11));

		System.out.println("firstDayOfMonth - " + localDateTime.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println("lastDayOfYear - " + localDateTime.with(TemporalAdjusters.lastDayOfYear()));
		System.out.println("firstDayOfNextMonth - " + localDateTime.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println("lastDayOfMonth - " + localDateTime.with(TemporalAdjusters.lastDayOfMonth()));

		System.out.println("plusHours - " + localDateTime.plusHours(2));
		System.out.println("plusMinutes - " + localDateTime.plusMinutes(12));

		System.out.println("minusHours - " + localDateTime.minusHours(2));
		System.out.println("minusMinutes - " + localDateTime.minusMinutes(24));
		System.out.println("minusMinutes - " + localDateTime.minus(24, ChronoUnit.MINUTES));
		System.out.println("minusSeconds - " + localDateTime.minusSeconds(29));
		System.out.println("minusNanos - " + localDateTime.minusNanos(288889));

		System.out.println("withHour - " + localDateTime.withHour(22));
		System.out.println("withMinute - " + localDateTime.withMinute(22));

		/*
		 * Additional support methods
		 */
		System.out.println("isEqual - " + localDateTime.isEqual(localDateTime1));
		System.out.println("isBefore - " + localDateTime.isBefore(localDateTime1));
		System.out.println("isAfter - " + localDateTime.isAfter(localDateTime1));

	}

}
