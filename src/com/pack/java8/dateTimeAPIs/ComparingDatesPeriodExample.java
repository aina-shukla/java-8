package com.pack.java8.dateTimeAPIs;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.of(2018, 01, 01);
		LocalDate localDate1 = LocalDate.of(2018, 12, 31);

		Period period = localDate.until(localDate1);
		System.out.println(period);
		System.out.println("getDays " + period.getDays());
		System.out.println("getMonths " + period.getMonths());
		System.out.println("getYears " + period.getYears());
		System.out.println("getClass " + period.getClass());
		System.out.println("getUnits " + period.getUnits());

		Period period2 = Period.ofDays(10);
		System.out.println("getDays " + period2.getDays());

		Period period3 = Period.ofYears(10);
		System.out.println("getYears " + period3.getYears());

		Period period4 = Period.between(localDate, localDate1);
		System.out.println("getDays " + period4.getDays());
		System.out.println("getYears " + period4.getYears());

	}

}
