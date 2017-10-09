package com.ocajexam.exercises.testprep;

public class MyClass {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		int z = 1;
		if (checkSum(x, y) || checkSum(y, z)) {
			System.out.print("a");
		}
	}

	private static boolean checkSum(int x, int y) {
		if (x + y >= 7) {
			System.out.print("b");
			return true;
		}
		System.out.println("c");
		return false;
	}
}
