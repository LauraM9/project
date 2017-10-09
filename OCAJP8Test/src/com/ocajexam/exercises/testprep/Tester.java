package com.ocajexam.exercises.testprep;

public class Tester {
	public static void main(String[] args) {
		Tester test = new Tester();
		System.out.print(test.mult(2.0));
		
		System.out.println();
		int i = 0;
		do {
			int x = 0;
			x = x * i;
			System.out.print(x + " ");
			x++;
			i++;
		} while (i < 3);
		
	}
	
	int mult(int num) {
		return num * num;
	}
	
	double mult(double num) {
		return num * num;
	}
}
