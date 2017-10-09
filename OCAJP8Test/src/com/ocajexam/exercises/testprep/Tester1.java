package com.ocajexam.exercises.testprep;

public class Tester1 {
	
	interface Calculations {
		int calculation(int a, int b);
	}
	
	public static int performCalculation(int a, int b, Calculations calc) {
		return calc.calculation(a, b);
	}
	
	public static int subA(int a, boolean b) {
		if (!b) return a;
		else return 0 - a;
	}

	public static void main(String[] args) {
		Calculations multiplication = (int a, int b) -> a * b;
		Calculations subtraction = (int a, int b) -> a - b;
		System.out.println(performCalculation(5, 3, multiplication) + "\n" + performCalculation(5, 3, subtraction));
		
		System.out.println();
		boolean b = false;
		int a = 4;
		if (a > 5 || !b) {
			if (subA(a, b) > 0) {
				System.out.println(subA(a, b));
			} else {
				System.out.println(0 - subA(a, b));
			}
		} else System.out.println(b);
		
	}

}
