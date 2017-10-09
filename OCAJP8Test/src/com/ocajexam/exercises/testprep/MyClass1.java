package com.ocajexam.exercises.testprep;

import java.io.IOException;

public class MyClass1 {

	public static String getStr(String str) throws IOException {
		if (str == null) {
			throw new IOException();
		}
		return "Done";
	}

	public static void main(String[] args) {
		String s = null;
		try {
			String tester = getStr(s);
			System.out.println("The value of tester is: " + tester);
		} catch (IOException e) {
			System.out.println("IOException caught");
		}
	}

}
