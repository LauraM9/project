package com.ocajexam.exercises.quiz;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Test1 {
	
	enum Coin {penny, nickel, dime, quarter}

	public static void main(String[] args) {
		Store store = new FoodStore();
//		FoodStore foodStore = new Store();
		Object obj = new FoodStore();
		Object obj1 = new Store();
		
		String string = "Dollar bill";
		string.replace("Dollar bill", "Silver dollar");
		if ("Dollar bill".equals(string)) {
			System.out.println("I have a dollar bill.");
		} else {
			System.out.println("I have a silver bill.");
		}
		
		boolean value = true;
		System.out.print(true || (value = false));
		System.out.println(", " + value);
		
		int a = 1;
		do 
			a = 2;
		while (a == 1);
			
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_WEEK_DATE));
		
		int value1 = 5;
		int value2 = 7;
		boolean bool1 = true;
		boolean bool2 = false;
		if (bool1 && ((value1 < value2) || bool2) && !(bool2)) {
			System.out.println("Result set is one");
		} else {
			System.out.println("Result set is two");
		}
		
		new ClassB();
		
		Period period = Period.parse("P52W");
		System.out.println(period.getDays() + " days");
		
		int i = 0;
		int result = 0;
		while (i < 0) {
			result = i + i;
			i = i * i;
		}
		System.out.println("result = " + result);
		
		int[] sampleArray = new int[5];
		for (int j = 0; j < sampleArray.length; j++) {
			sampleArray[j] = sampleArray.length - j;
		}
		System.out.println("sampleArray[3] = " + sampleArray[3]);
		
//		int variableA = 10;
//		float variableB = 10.5f;
//		int variableC = variableA + variableB;
		
		int array[][] = {{1,2,3},{3,2,1}};
		for (int ii[] : array) {
			for (int j : ii) {
				System.out.print(j + " ");
			}
		}
		System.out.println();
		
//		Period p1 = Period.parse("42Y6M6D");
//		Period p2 = Period.parse("p42y6m6d");
//		Period p3 = Period.parse(42, 6, 6);
//		Period p4 = Period.of(42, 6);
//		Period p5 = Period.of("P42y6m6d");
//		Period p6 = Period.of("42", "6", "6");
		
		int aa = 0;
		int b = 0;
		int c = 0;
		System.out.println(aa++ + " " + --b + " " + c++ + " " + a + " " + b);
		
		LocalTime lt = LocalTime.NOON;
		LocalDateTime ldt = lt.atDate(LocalDate.of(2015, Month.JANUARY, 1));
		System.out.println(lt + " " + ldt);
		
		long d = 1000L;
		float f = 1000f;
		
		Object[] o = {"", 5, new Object(), 4.2};
		Integer ln = 66; 
		ArrayList<String> s = new ArrayList<>();
		
		int k = 0;
		float l = k;
		
	}
}
