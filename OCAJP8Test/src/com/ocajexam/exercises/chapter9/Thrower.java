package com.ocajexam.exercises.chapter9;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Thrower {

	public static void main(String[] args) {
		Thrower t = new Thrower();
//		try {
//			t.throw1();
//		} catch (IOException e) {
//			System.out.println("An IOException has occured");
//		}
//
//		try {
//			System.out.println("What's up");
//			throw new ArithmeticException();
//			// System.out.println(", Hello!"); not reached
//		} catch (ArithmeticException ae) {
//			System.out.println(", Howdy!");
//			ae.printStackTrace();
//		}

//		t.demonstrateTryCatch();
//		t.demonstrateTryCatchPrintData();
//		t.demonstrateTryFinally();
//		t.demonstrateTryWithResourcesOld();
//		t.demonstrateTryWithResourcesNew();
		t.demonstrateMultiCatch2();
	}

	public void demonstrateTryCatch() {
		try {
			throw new NumberFormatException();
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		} catch (IllegalArgumentException iae) {
			iae.printStackTrace();
		} catch (RuntimeException re) {
			re.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void demonstrateTryCatchPrintData() {
		try {
			int result = (3 / 0);
		} catch (ArithmeticException ae) {
			System.out.println("ae.getMessage():");
			System.out.println(ae.getMessage());
			System.out.println("ae.toString():");
			System.out.println(ae.toString());
			System.out.println("ae.printStackTrace():");
			ae.printStackTrace();
		}
	}
	
	public void demonstrateTryFinally() {
		try {
			System.out.print("Jab");
			System.exit(0);
		} finally {
			System.out.println(" and Roundhouse");
		}
	}
	
	public void demonstrateTryWithResourcesOld() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Number of apples: ");
			int apples = sc.nextInt();
			System.out.print("Number of oranges: ");
			int oranges = sc.nextInt();
			System.out.println("Pieces of Fruit: " + (apples + oranges));
		} catch (InputMismatchException ime) {
			ime.printStackTrace();
		} finally {
			System.out.print("Closing scanner resource");
			sc.close();
		}
	}
	
	public void demonstrateTryWithResourcesNew() {
		try (Scanner sc = new Scanner(System.in)){
			System.out.print("Number of apples: ");
			int apples = sc.nextInt();
			System.out.print("Number of oranges: ");
			int oranges = sc.nextInt();
			System.out.println("Pieces of Fruit: " + (apples + oranges));
		} catch (InputMismatchException ime) {
			ime.printStackTrace();
		}
	}
	
	public void demonstrateMultiCatch2() {
		try {
			Random random = new Random();
			int i = random.nextInt(2);
			if (i == 0) {
				throw new ArrayIndexOutOfBoundsException();
			} else {
				throw new NullPointerException();
			}
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			e.printStackTrace();
		}
	}

	public void throw1() throws IOException {
		throw2();
	}

	public void throw2() throws IOException {
		throw3();
	}

	public void throw3() throws IOException {
		throw4();
	}

	public void throw4() throws IOException {
		throw new IOException();
	}

}
