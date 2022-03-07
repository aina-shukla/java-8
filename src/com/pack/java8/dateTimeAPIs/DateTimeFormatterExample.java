package com.pack.java8.dateTimeAPIs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {

	// parse - convert string to localDate, localtime , localdatetime
	// format - convert above three to string

	public static void parseLocalDate() {

		// string to localdate
		String date = "2022-03-07";
		LocalDate dateTimeFormatter = LocalDate.parse(date);
		System.out.println("parse " + dateTimeFormatter);

		LocalDate dateTimeFormatter1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(dateTimeFormatter1);

		String date1 = "20220307";
		LocalDate dateTimeFormatter2 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(dateTimeFormatter2);

		/*
		 * Custom defined formats
		 */
		String date2 = "2022|03|07";
		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		LocalDate dateTimeFormatter4 = LocalDate.parse(date2, dateTimeFormatter3);
		System.out.println(dateTimeFormatter4);

		String date3 = "2022*03*07";
		DateTimeFormatter dateTimeFormatter5 = DateTimeFormatter.ofPattern("yyyy*MM*dd");
		LocalDate dateTimeFormatter6 = LocalDate.parse(date3, dateTimeFormatter5);
		System.out.println(dateTimeFormatter6);
	}

	public static void formatLocalDate() {

		// localdate to string

		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		LocalDate date = LocalDate.now();
		String dateString = date.format(dateTimeFormatter3);
		System.out.println(dateString);
	}

	public static void parseLocalTime() {

		// string to localtime

		String time = "22:04:06";
		LocalTime localTime = LocalTime.parse(time);
		System.out.println(localTime);

		LocalTime dateTimeFormatter1 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println(dateTimeFormatter1);

		/*
		 * Custom defined formats
		 */
		String time2 = "22|04|06";
		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("HH|mm|ss");
		LocalTime dateTimeFormatter4 = LocalTime.parse(time2, dateTimeFormatter3);
		System.out.println(dateTimeFormatter4);

		String time4 = "22*04*09";
		DateTimeFormatter dateTimeFormatter5 = DateTimeFormatter.ofPattern("HH*mm*ss");
		LocalTime dateTimeFormatter6 = LocalTime.parse(time4, dateTimeFormatter5);
		System.out.println(dateTimeFormatter6);

	}

	public static void formatLocalTime() {
		// localtime to string

		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("HH-mm-ss");
		LocalTime time = LocalTime.now();
		String dateString = time.format(dateTimeFormatter3);
		System.out.println(dateString);
	}

	public static void parseLocalDateTime() {
		// string to localdatetime

		String date = "2022-03-07T22:17:14.556162300";
		LocalDateTime dateTimeFormatter = LocalDateTime.parse(date);
		System.out.println("parse " + dateTimeFormatter);

		LocalDateTime dateTimeFormatter1 = LocalDateTime.parse(date, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println(dateTimeFormatter1);

		/*
		 * Custom defined formats
		 */
		String time2 = "2022|03|07T22|17|14";
		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy|MM|dd'T'HH|mm|ss");
		LocalDateTime dateTimeFormatter4 = LocalDateTime.parse(time2, dateTimeFormatter3);
		System.out.println(dateTimeFormatter4);
	}

	public static void formatLocalDateTime() {

		// localdatetime to string

		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy|MM|dd'T'HH|mm|ss");
		LocalDateTime time = LocalDateTime.now();
		String dateString = time.format(dateTimeFormatter3);
		System.out.println(dateString);

	}

	public static void main(String[] args) {
		parseLocalDate();
		formatLocalDate();
		parseLocalTime();
		formatLocalTime();
		parseLocalDateTime();
	}

}
