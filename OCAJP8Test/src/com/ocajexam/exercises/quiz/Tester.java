package com.ocajexam.exercises.quiz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tester {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld.format(DateTimeFormatter.ISO_LOCAL_DATE));
//		System.out.println(ld.format(ISO_LOCAL_DATE)); //error
	}

}
