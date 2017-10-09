package com.ocajexam.exercises.chapter10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;

import static java.time.format.DateTimeFormatter.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;

public class Formatters {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
//		System.out.println("RESULT 1: " + ld.format(DateTimeFormatter.ISO_WEEK_DATE));
//		System.out.println("RESULT 2: " + ld.format(ISO_WEEK_DATE));
		
		OffsetDateTime odt = OffsetDateTime.now();
//		System.out.println(odt.format(ISO_DATE));
//		System.out.println(odt.format(ISO_OFFSET_DATE));
//		System.out.println(odt.format(ISO_OFFSET_DATE_TIME));
		
		ZonedDateTime zdt = ZonedDateTime.now();
//		System.out.println(zdt.format(ISO_DATE_TIME));
//		System.out.println(zdt.format(ISO_ZONED_DATE_TIME));
//		System.out.println(zdt.format(DateTimeFormatter.RFC_1123_DATE_TIME));
		
		ArrayList<DateTimeFormatter> ldtformatterList= new ArrayList<>();
		ldtformatterList.add(DateTimeFormatter.BASIC_ISO_DATE);
		ldtformatterList.add(DateTimeFormatter.ISO_LOCAL_TIME);
		ldtformatterList.add(DateTimeFormatter.ISO_LOCAL_DATE);
		ldtformatterList.add(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		ldtformatterList.add(DateTimeFormatter.ISO_TIME);
		ldtformatterList.add(DateTimeFormatter.ISO_DATE);
		ldtformatterList.add(DateTimeFormatter.ISO_DATE_TIME);
		ldtformatterList.add(DateTimeFormatter.ISO_ORDINAL_DATE);
		
//		LocalDateTime ldt = LocalDateTime.now();
//		ldtformatterList.forEach(c -> {
//			System.out.println(ldt.format(c));
//		});
		
//		System.out.println("SHORT: " + ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
//		System.out.println("MEDIUM: " + ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
//		System.out.println("LONG: " + ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
//		System.out.println("FULL: " + ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
		
		LocalTime lt = LocalTime.now();
//		System.out.print("SHORT: " + lt.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)) + " ");
//		System.out.println("MEDIUM: " + lt.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
//
//		System.out.print("SHORT: " + DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(lt) + " ");
//		System.out.println("MEDIUM: " + DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(lt));
		
//		final LocalDateTime ldt = LocalDateTime.now();
//		System.out.println(ldt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
//		System.out.println(ldt.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
//		System.out.println(ldt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
//		
//		Path currentRelativePath = Paths.get("");
//		String s = currentRelativePath.toAbsolutePath().toString();
//		System.out.println("Current relative path is: " + s);
//		
//		String dateTime = ldt.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
//		Path target = Paths.get(s + "\\logs\\" + "app_props_" + dateTime + ".properties");
//		try {
//			System.out.println(Files.createFile(target).getFileName());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		String[] minutes = {"m", "mm"};
		String[] hours = {"h", "hh"};
		String[] days = {"d", "dd"};
		String[] months = {"M", "MM", "MMM", "MMMM", "MMMMM"};
		String[] years = {"y", "yy", "yyyy"};
		String converts = "->";
		final LocalDateTime ldt = LocalDateTime.parse("2015-01-01T01:01:01");
		System.out.print("Hours:      ");
		Arrays.asList(hours).forEach(p -> {
			System.out.print(p + converts + ldt.format(DateTimeFormatter.ofPattern(p)) + "  ");
		});
		
		System.out.print("\nMinutes:   ");
		Arrays.asList(minutes).forEach(p -> {
			System.out.print(p + converts + ldt.format(DateTimeFormatter.ofPattern(p)) + "  ");
		});
		
		System.out.print("\nMonths:   ");
		Arrays.asList(months).forEach(p -> {
			System.out.print(p + converts + ldt.format(DateTimeFormatter.ofPattern(p)) + "  ");
		});
		
		System.out.print("\nDays:   ");
		Arrays.asList(days).forEach(p -> {
			System.out.print(p + converts + ldt.format(DateTimeFormatter.ofPattern(p)) + "  ");
		});
		
		System.out.print("\nYears:   ");
		Arrays.asList(years).forEach(p -> {
			System.out.print(p + converts + ldt.format(DateTimeFormatter.ofPattern(p)) + "  ");
		});
	}

}
