package com.ocajexam.exercises.testprep;

public class Counting {

	public static void main(String[] args) {
		int x = 0;
		for (int y = 0; y < 5; y++) {
			x++;
			if (x == 3) {
				continue;
			}
			System.out.print(x + " ");
		}
	}

}
