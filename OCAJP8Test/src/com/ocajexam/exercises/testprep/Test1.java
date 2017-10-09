package com.ocajexam.exercises.testprep;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		String name1 = new String("Java");
		String name2 = new String("Java");
		
		if (name1 == name2) {
			System.out.println("Objects are equal");
		} else {
			System.out.println("Objects are not equal");
		}
		
		if (name1.equals(name2)) {
			System.out.println("Objects are equal");
		} else {
			System.out.println("Objects are not equal");
		}
		
		String rhyme = "She sells sea shells";
		StringBuilder sb = new StringBuilder(rhyme);
		System.out.println(sb.reverse());
		
		StringBuilder sb1 = new StringBuilder("Test ");
		String test = sb1.append("StringBuilder").toString();
		
		int level = 2;
		ArrayList<String> myArrayList = new ArrayList<>();
		switch (level) {
		case 1: myArrayList.add("Level 1");
		case 2: myArrayList.add("Level 2");
		case 3: myArrayList.add("Level 3");
		case 4: myArrayList.add("Level 4");
		case 5: myArrayList.add("Level 5");
				break;
		default: System.out.println("Please specify a level");
			break;
		}
		if (myArrayList.isEmpty()) {
			System.out.println("Invalid level number");
		} else {
			for (String levelNum : myArrayList) {
				System.out.println(levelNum);
			}
		}
		
		String data = "2015-11-26T16:54:30";
		LocalDateTime date = LocalDateTime.parse(data, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println(date);
		
		int a = 0;
		try {
			a = 5 / 0;
			System.out.println("Inside try: a = " + a);
		} catch (Exception e) {
			System.out.print("Cannot divide by zero");
			System.out.println();
			System.out.println("Outside try: a = " + a);
		}
		
		A a1 = new A();
		B b1 = new B();
		a1 = b1;
		B b2 = (B) a1;
	}
}
