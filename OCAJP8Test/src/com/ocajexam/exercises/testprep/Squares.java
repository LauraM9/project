package com.ocajexam.exercises.testprep;

public class Squares {

	public static void main(String[] args) {
		int x = 2;
		System.out.println("x squared = " + squareNumber(x));
		System.out.println("x = " + x);
	}

	public static int squareNumber(int x) {
		x = x * x;
		return x;
	}
}
