/**
 * 
 */
package com.ss.dataandtime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

/**
 * @author Alfred
 *
 */
public class DataAndTimeAPIDayFive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.now();
		Integer year = localDateTime.getYear();
		Month month = localDateTime.getMonth();

		System.out.println(
				"1.: I would use the LocalDateTime class to store my birthday I could also use ZoneDateTime if I want to take in account for time zone.");
		System.out.println(
				"\n2: By using a TemporalAdjuster such as - date = date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));");
		System.out.println(
				"\n3: ZoneOffSet tracks only the absoulte offset from the Greenwich/UTC as for the ZoneId it use ZoneRules to determine the offset");
		System.out.println(
				"\n4: you can convert an Instant to a ZoneDateTime by using ofInstant method and you also need the ZoneId - ZonedDateTime zone = ZonedDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());");

		// ZonedDateTime zone = ZonedDateTime.ofInstant(Instant.now(),
		// ZoneId.systemDefault());

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println(
				"5. Write an example that, for a given year, reports the length of each month within that year.");
		System.out.println("Year: " + year);

		for (int i = 1; i <= 12; i++) {
			LocalDate date = LocalDate.of(year, Month.of(i), 1);
			System.out.println(date.getMonth() + ": " + date.lengthOfMonth());
		}
		System.out.println(" ");

		System.out.println(
				"6. Write an example that, for a given month of the current year, lists all of the Mondays in that month.");
		LocalDate date = LocalDate.of(year, month, 1);
		date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		while (date.getMonth() == month) {
			System.out.println(date + " is a Monday!");
			date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		}

		System.out.println(" ");
		System.out.println("7. Write an example that tests whether a given date occurs on Friday the 13th.");
		month = Month.NOVEMBER;
		Integer day = 13;
		System.out.println(month);
		System.out.println("Day: " + day);

		date = Year.now().atMonth(month).atDay(day);
		if (date.get(ChronoField.DAY_OF_MONTH) == 13) {
			System.out.println(date + " Friday 13th!");
		}

	}

}
