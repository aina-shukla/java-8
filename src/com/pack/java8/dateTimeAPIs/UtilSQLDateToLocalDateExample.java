package com.pack.java8.dateTimeAPIs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class UtilSQLDateToLocalDateExample {

	public static void main(String[] args) {

		/*
		 * java.util.Date to LocalDate , vice versa
		 */

		Date dateUtil = new Date();
		System.out.println("util - " + dateUtil);
		System.out.println("to localDate - " + dateUtil.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
		LocalDate dateTime = dateUtil.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		Date date1 = new Date().from(dateTime.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
		System.out.println("localdate to util - " + date1);

		/*
		 * java.sql.Date to LocalDate, vice versa
		 */

		java.sql.Date dateSQL = java.sql.Date.valueOf(dateTime);
		System.out.println("localdate to sql date - " + dateSQL);
		LocalDate date = dateSQL.toLocalDate();
		System.out.println("sql to localdate - " + date);
	}

}
