package com.ocajexam.exercises.chapter10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class SelfTest {

	public static void main(String[] args) {
		Period p = Period.parse("P1Y");
//		System.out.println(p.getMonths());
//		
//		LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE);
//		LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE);
//		LocalDateTime.now().format(DateTimeFormatter.ISO_DATE);
//		LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
//		LocalDateTime.now().format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
		
		LocalDate ld = LocalDate.of(1940, Month.JANUARY, 3);
		ld = ld.minusYears(3).plusMonths(10).plusDays(15);
		ld.minusYears(10);
//		System.out.println(ld.getMonth() + " " + ld.getYear());
		
		String date1 = "2011-12-03";
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate localDate1 = LocalDate.parse(date1, formatter1);
//		System.out.print(localDate1.toString() + " ");
		String date2 = "2011-12-03T00:00:00";
		DateTimeFormatter formatter2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		LocalDateTime localDate2 = LocalDateTime.parse(date2, formatter2);
//		System.out.println(date2.toString());
		
		LocalDateTime ldt = LocalDateTime.parse("2001-01-01T01:01:00");
		ldt = LocalDateTime.of(2001, Month.JANUARY, 1, 1, 1);
		Period period = Period.parse("P1Y1M1D");
		ldt = ldt.plus(period);
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//		System.out.println(ldt.format(formatter));
		
		LocalDateTime currentTime = LocalDateTime.now();
		LocalTime meetingTime = LocalTime.of(16, 0);
		if (meetingTime.isBefore(currentTime.toLocalTime())) {
			System.out.println("You're late!");
		} else {
			System.out.println("There is a meeting later today ");
//			{
//				Period pp = Period.between(currentTime.toLocalDate(), meetingTime);
//			}
			{
				long a = ChronoUnit.HOURS.between(currentTime.toLocalTime(), meetingTime);
				System.out.println("in less that " + ++a + ((a == 1) ? "hour." : " hours"));
			}
		}
	}

}
