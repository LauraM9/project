package com.ocajexam.exercises.chapter9;

import java.io.FileNotFoundException;

public class SelfTest {
	
	public static void testMethod1() {
		try {
			testMethod2();
		} catch (Exception e) {
			System.out.println("Dock");
		}
	}
	
	public static void testMethod2() throws ArithmeticException {
		try {
			testMethod3();
		} catch (Exception e) {
			System.out.println("Dickory");
		}
	}
	
	public static void testMethod3() throws ArithmeticException {
		throw new ArithmeticException();
//		System.out.println("Hickory");
	}
	
	public static void test() throws FileNotFoundException {
		try {
//			throw new InternalError
		} finally {
		}
	}

	public static void main(String[] args) {
		testMethod1();
	}

}
