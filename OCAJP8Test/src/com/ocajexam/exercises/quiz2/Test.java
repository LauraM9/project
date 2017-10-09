package com.ocajexam.exercises.quiz2;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String[][] multiArray = new String[5][5];
		for (String[] a : multiArray) {
			Arrays.fill(a, "test");
		}
		for (String[] b : multiArray) {
			System.out.println();
			for (String c : b) {
				System.out.print(c + " ");
			}
		}
	}

}
