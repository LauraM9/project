package com.ocajexam.exercises.quiz2;

public class Tester {
	int x = 10;
	public static void main(String[] args) {
		Tester test = new Tester();
		int x = 1;
		for (int y = 0; y < 3; y++) {
			x++;
		}
		System.out.print("x is: " + test.x);
		
		System.out.println("\n");
		
		int i = 0;
		do {
			int xx = 0;
			xx = xx * i;
			System.out.print(xx + " ");
			xx++;
			i++;
		} while (i < 3);
		
		System.out.println("\n");
		
		int y = 0;
		int j = 0;
		for (;j < 5; j++) {
			y++;
			if (y == 3){
				break;
			}
			System.out.println("y is: " + y);
			System.out.println("j is: " + j);
		}
		
//		System.out.println("y is: " + y);
//		System.out.println("j is: " + j);
	}
}
