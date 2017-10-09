package com.ocajexam.exercises.testprep;

public class NumberChange {

	public static void main(String[] args) {
		int x = 10;
		NumberChange num = new NumberChange();
		num.changeNumber(x);
		System.out.println("x is: " + x);
	}

	public void changeNumber(int x) {
		x = 15;
	}
}
