package com.ocajexam.exercises.quiz2;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		int myNum = new Integer(5);

		int x = 5, y = 10;
		do {
			--x;
			System.out.println(x + " ");
			y++;
		} while (y < 12);

		System.out.println();

		ArrayList myArrayList = new ArrayList();
		myArrayList.add(1);
		myArrayList.add(2);
		myArrayList.add(3);
		myArrayList.remove(1);

		for (Object b : myArrayList) {
			System.out.print(b + " ");
		}
		System.out.println("\n");
		subB();
		System.out.println("\n");
		
		Object[][] myArray;
		myArray = new String[4][10];
		for (Object[] b : myArray) {
			System.out.println();
			for (Object c : b) {
				System.out.print(c + " ");
			}
		}
		
	}

	public static void subB() {
		int a = 2;
		String b = "conditional";
		if (b.charAt(a) > b.charAt(++a)) {
			System.out.println(b.charAt(a));
		} else {
			System.out.println(b.charAt(0));
		}
	}

}
