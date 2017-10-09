package com.ocajexam.exercises.chapter3;

public class ArithmeticResultsOutput {
	
	public void validatePrime() {
		long p = 17496;
		Double primeSquareRoot = Math.sqrt(p);
		boolean isPrime = true;
		for (long j = 2; j <= primeSquareRoot.longValue(); j++) {
			if (p % j == 0) {
				System.out.println(j + "x" + p/j);
				isPrime = false;
			}
		}
		System.out.println("Prime number: " + isPrime);
	}

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		if (i++ == ++j) {
//			System.out.println("True: i = " + i + ", j = " + j);
		} else {
//			System.out.println("False: i = " + i + ", j = " + j);
			
//			System.out.println("i++ = " + i++);
//			System.out.println("i = " + i);
//			System.out.println("++j = " + ++j);
//			System.out.println("j = " + j);
			
			float intermediar = 49 % 26;
//			System.out.println("49 % 26 = " + intermediar);
			
			float intermediar1 = intermediar % 5;
//			System.out.println("49 % 26 % 5 = " + intermediar1);
			
			float intermediar2 = intermediar1 % 1;
//			System.out.println("49 % 26 % 5 % 1 = " + intermediar2);
			
//			System.out.println("direct: " + 49 % 26 % 5 % 1);
			
			int i1 = 100; int j1 = 200;
			if ((i1 == 99) & (--j1 == 199)) {
				System.out.print("Value1: " + (i1 + j1) + " ");
			} else {
				System.out.print("Value2: " + (i1 + j1) + " ");
			}
			
			int i2 = 100; int j2 = 200;
			
			if ((i2 == 99) && (--j2 == 199)) {
				System.out.print("Value1: " + (i2 + j2) + " ");
			} else {
				System.out.print("Value2: " + (i2 + j2) + " ");
			}
			
			int i3 = 100; int j3 = 200;
			if ((i3 == 100) | (--j3 == 200)) {
				System.out.print("Value1: " + (i3 + j3) + " ");
			} else {
				System.out.print("Value2: " + (i3 + j3) + " ");
			}
			
			int i4 = 100; int j4 = 200;
			if ((i4 == 100) || (--j4 == 200)) {
				System.out.print("Value1: " + (i4 + j4) + " ");
			} else {
				System.out.print("Value2: " + (i4 + j4) + " ");
			}
			
			ArithmeticResultsOutput aro = new ArithmeticResultsOutput();
			aro.validatePrime();
		}
	}

}
