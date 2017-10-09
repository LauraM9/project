package com.ocajexam.exercises.chapter6;

import java.util.ArrayList;

public class SelfTest {

	public static void main(String[] args) {
		Object obj[] = {new Object[2], new Object[1]};
		
		String[] numbers = {"One", "Two", "Three"};
//		for (String s : numbers) {
//			System.out.print(s + " ");
//		}
		
		int[] testScores = {80, 63, 99, 87, 100};
//		System.out.print("\nLength: " + testScores.length);
		
		Integer[] integerArray1 = {new Integer(100), new Integer(1), new Integer(30), new Integer(50)};
		Integer[] integerArray2 = new Integer[2];
		integerArray2[0] = new Integer(100);
		System.arraycopy(integerArray1, 2, integerArray2, 1, 1);
//		for (Integer i : integerArray2) {
//			System.out.print(i + " ");
//		}
		
		int[][] square = new int[3][3];
		for (int i = 0; i < 3; i++) {
			square[i][i] = 5;
		}
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum += square[i][j];
			}
		}
//		System.out.print(sum);
		
		int[][] square1 = new int[2][];
		square1[0] = new int[5];
		square1[1] = new int[3];
		
		ArrayList<Object> sampleArrayList = new ArrayList<Object>();
		sampleArrayList.add(new Object());
		sampleArrayList.ensureCapacity(15);
		sampleArrayList.add(new Object());
		int size = sampleArrayList.size();
//		System.out.print(size);
		
		ArrayList<String> sampleArrayList1 = new ArrayList<String>();
		sampleArrayList1.add("One");
		sampleArrayList1.add("Two");
		sampleArrayList1.add(1, "Three");
		
		for (String s : sampleArrayList1) {
			System.out.print(s + " ");
		}
		
		ArrayList<String[]> sampleArrayList2 = new ArrayList<String[]>();
		sampleArrayList2.add(new String[3]);
		
	}

}
