package com.ocajexam.exercises.chapter10;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

import javafx.util.converter.LocalDateStringConverter;

public class Main {

	public static void main(String[] args) {
//		LocalDateTime ldt = LocalDateTime.now().plusYears(14).plusMonths(2).plusDays(10);
//		System.out.println(ldt);
//		
//		System.out.println(LocalDate.of(2015, Month.JANUARY, 1));
//		System.out.println(Period.parse("P3M"));
//		System.out.println(Duration.ofDays(2).getSeconds());
//		System.out.println(LocalTime.parse("11:30").isAfter(LocalTime.NOON));
//		System.out.println(LocalDateTime.now().withYear(2001));
//		System.out.println(Period.of(5, 2, 1).plusDays(1));
//		System.out.println(Period.of(5, 2, 1).minusDays(1));
//		System.out.println(LocalTime.MAX.toSecondOfDay());
//		System.out.println(LocalTime.MIDNIGHT.atDate(LocalDate.now()));
		
//		System.out.println(LocalTime.now());
//		System.out.println(LocalTime.parse("12:00"));
//		System.out.println(LocalTime.of(12, 0));
//		System.out.println(LocalTime.of(12, 0, 1));
//		System.out.println(LocalTime.NOON);
//		System.out.println(LocalTime.of(12, 0, 0, 1));
//		System.out.println(LocalTime.now(ZoneId.of("Asia/Tokyo")));
//		System.out.println(LocalTime.parse("12:00", DateTimeFormatter.ISO_TIME));
		
//		System.out.println(LocalDateTime.now());
//		System.out.println(LocalDateTime.parse("2015-01-01T12:00:00"));
//		System.out.println(LocalDateTime.of(2015, 1, 1, 12, 0));
//		System.out.println(LocalDateTime.of(2015, Month.JANUARY, 1, 12, 0));
//		System.out.println(LocalDateTime.of(2015, 1, 1, 12, 0, 1));
//		System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));
//		System.out.println(LocalDateTime.parse("2015-01-01 12:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
		
//		Calendar calendar = Calendar.getInstance();
//		Instant instance = calendar.toInstant();
//		Date date = Date.from(instance);
//		LocalDateTime ldt1 = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
//		System.out.println(ldt1);
		
		LocalDateTime ldt2 = LocalDateTime.now();
		ldt2 = ldt2.plusYears(1).plusMonths(12).plusNanos(0);
		
		final Period p1 = Period.ofYears(1);
		final Period p2 = Period.ofMonths(12);
		final Period p3 = Period.ofWeeks(52);
		final Period p4 = Period.ofDays(366);
		final Period p5 = Period.of(1, 12, 366);
		
		LocalDate ld1 = LocalDate.of(2000, Month.JANUARY, 1);
		LocalDate ld2 = null;
		ld2 = ld1.plus(p1).plus(p2).plus(p3).plus(p4).plus(p5);
//		System.out.println("Before: " + ld1 + " After: " + ld2);
		
		Period period1 = Period.parse("P41Y2M3D");
//		System.out.println(period1);
		
		Period period2 = Period.parse("P4W");
//		System.out.println(period2.getDays() + " days");
		
		Period period3 = Period.of(5, 1, 14);
		int years = period3.getYears();
		int months = period3.getMonths();
		long days = period3.get(ChronoUnit.DAYS);
//		System.out.println(years + " years, " + months + " months, " + days + " days");
		
		Period p11 = Period.of(1, 1, 1);
		p11 = p11.withYears(5);
		System.out.println(p11);
		
		Period p22 = Period.of(1, 1, 1);
		p22 = p22.withMonths(5);
		System.out.println(p22);
		
		Period p33 = Period.of(1, 1, 1);
		p33 = p33.withDays(5);
		System.out.println(p33);
		
		Period p44 = Period.of(5, 2, 1);
		p44 = p44.plusYears(10);
		p44 = p44.plusMonths(10);
		p44 = p44.plusDays(15);
		p44 = p44.plus(Period.ofDays(15));
//		System.out.println("Period value: " + p44);
		
		Period p55 = Period.of(15, 12, 31);
		p55 = p55.minusYears(10);
		p55 = p55.minusMonths(10);
		p55 = p55.minusDays(15);
		p55 = p55.minus(Period.ofDays(15));
//		System.out.println("Period value: " + p55);
		
		Period p6 = Period.parse("P10D").minusDays(10);
//		System.out.println("Is zero: " + p6.isZero());
		
		Period p7 = Period.parse("P2015M");
		p7 = p7.minusMonths(2016);
//		System.out.println("Is negative: " + p7.isNegative());
		
		final String WAR_OF_1812_START_DATE = "1812-06-18";
		final String WAR_OF_1812_END_DATE = "1815-02-18";
		LocalDate warBegins = LocalDate.parse(WAR_OF_1812_START_DATE);
		LocalDate warEnds = LocalDate.parse(WAR_OF_1812_END_DATE);
		Period p8 = Period.between(warBegins, warEnds);
		System.out.println("WAR OF 1812 TIMEFRAME: " + p8);
	}

}
