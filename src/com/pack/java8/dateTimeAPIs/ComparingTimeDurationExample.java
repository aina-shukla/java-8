package com.pack.java8.dateTimeAPIs;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimeDurationExample {

	public static void main(String[] args) {

		LocalTime localTime = LocalTime.of(7, 16);
		LocalTime localTime1 = LocalTime.of(8, 16);

		long diff = localTime.until(localTime1, ChronoUnit.MINUTES);
		System.out.println(diff);

		Duration duration = Duration.between(localTime, localTime1);
		System.out.println(duration.getSeconds() + ", minutes " + duration.toMinutes());

	}

}
