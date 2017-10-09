package com.ocajexam.exercises.chapter9;

public class Example {

	public static void main(String[] args) {
		System.out.print("Bread");
		try {
			throw new NumberFormatException(); // unchecked exception
		} finally {
			System.out.print(" and "); // this gets executed
		}
//		System.out.print(" butter"); this statement is not reached
	}

}
