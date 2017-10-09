package com.ocajexam.exercises.quiz1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Test {
	public static int num = 0;
}

public class Quiz1 {
	
	public static void main(String[] args) {
		if (args.length > 0) {
			String planet = args[0];
			switch (planet) {
			case "Mercury":
			case "Venus":
			case "Earth":
			case "Mars":
				System.out.println("This is an inner planet");
				break;
			case "Jupiter":
			case "Saturn":
			case "Uranus":
			case "Neptune":
				System.out.println("This is an outer planet");
				break;
			default:
				System.out.println("Not a planet from our solar system");
				break;
			}
		} else {
			System.out.println("No input");
		}
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DDD MM YYYY");
		LocalDate date = LocalDate.of(2015, 12, 20);
		System.out.println(date.format(formatter));
		
		Test a = new Test();
		Test b = new Test();
		a.num += 1;
		b.num += a.num;
		System.out.println("a.num = " + a.num);
		System.out.println("b.num = " + b.num);
		
		System.out.println("conditional".charAt(0));
	}

}
