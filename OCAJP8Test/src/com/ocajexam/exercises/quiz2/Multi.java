package com.ocajexam.exercises.quiz2;

public class Multi {

	public static void main(String[] args) {
		int[][] myArray = {{1, 2, 3}, {4, 5}, {6, 7, 8}};
		System.out.println(myArray[1][1]);
		
		for (int[] b : myArray) {
			System.out.println();
			for (int c : b) {
				System.out.print(c + " ");
			}
		}
	}

}
