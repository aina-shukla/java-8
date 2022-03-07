package com.pack.java8.dateTimeAPIs;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

	public static void main(String[] args) {
		// LocalDate

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		LocalDate localDate1 = LocalDate.of(2017, 03, 24);
		System.out.println(localDate1);

		LocalDate localDate2 = LocalDate.ofYearDay(2017, 03); // 03- day of year
		System.out.println(localDate2);

		System.out.println("getMonth - " + localDate.getMonth());
		System.out.println("getDayOfMonth - " + localDate.getDayOfMonth());
		System.out.println("getDayOfYear - " + localDate.getDayOfYear());
		System.out.println("getMonthValue - " + localDate.getMonthValue());
		System.out.println("getYear - " + localDate.getYear());
		System.out.println("getChronology - " + localDate.getChronology());
		System.out.println("getDayOfWeek - " + localDate.getDayOfWeek());
		System.out.println("getEra - " + localDate.getEra());
		System.out.println("getClass - " + localDate.getClass());
		System.out.println("DAY_OF_MONTH - " + localDate.get(ChronoField.DAY_OF_MONTH));
		System.out.println("DAY_OF_MONTH - " + localDate.getLong(ChronoField.DAY_OF_MONTH));

		/*
		 * Modify localDate instance
		 */

		System.out.println("Plus 3 days to current date - " + localDate.plusDays(3));
		System.out.println("Plus 2 months to current date - " + localDate.plusMonths(2));
		System.out.println("Plus 4 weeks to current date - " + localDate.plusWeeks(4));
		System.out.println("Plus 1 year to current date - " + localDate.plusYears(1));

		System.out.println("Minus 3 days to current date - " + localDate.minusDays(3));
		System.out.println("Minus 2 months to current date - " + localDate.minusMonths(2));
		System.out.println("Minus 4 weeks to current date - " + localDate.minusWeeks(4));
		System.out.println("Minus 1 year to current date - " + localDate.minusYears(1));

		System.out.println("Minus 1 year to current date using TemporalUnit - " + localDate.minus(1, ChronoUnit.YEARS));

		System.out.println("Withyear - " + localDate.withYear(2019));
		System.out.println("Withdayofyear - " + localDate.withDayOfYear(11));

		System.out.println("firstDayOfMonth - " + localDate.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println("lastDayOfYear - " + localDate.with(TemporalAdjusters.lastDayOfYear()));
		System.out.println("firstDayOfNextMonth - " + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println("lastDayOfMonth - " + localDate.with(TemporalAdjusters.lastDayOfMonth()));

		/*
		 * Additional support methods
		 */
		
		System.out.println("isLeapYear - " + localDate.isLeapYear());
		System.out.println("isEqual - " + localDate.isEqual(localDate1));
		System.out.println("isBefore - " + localDate.isBefore(localDate1));
		System.out.println("isAfter - " + localDate.isAfter(localDate1));

	}

}
