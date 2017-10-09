package com.ocajexam.exercises.chapter6;

public class OneDimensionalArrays {

	public static void main(String[] args) {
		int[] arrayOfInts = new int[3];
		arrayOfInts[0] = 5;
		arrayOfInts[1] = 10;
		arrayOfInts[2] = 15;
		System.out.println("First: " + arrayOfInts[0] + " Second: " + arrayOfInts[1] + " Third: " + arrayOfInts[2]);
		
		String[] clockTypes = new String[3];
		String clockTypes1[] = new String[3];
		clockTypes = new String[4];
		int alarms[] = new int[2];
		
		int[] alarms1 = {730, 900};
		String[] clockTypes2 = {"Wrist Watch", "Desk Clock", "Wall Clock"};
//		System.out.println(clockTypes2[1]);
//		System.out.println("length: " + clockTypes2.length);
		
		String[] newClockTypes = new String[2];
		System.arraycopy(clockTypes2, 1, newClockTypes, 0, 2);
		for (String s : clockTypes2) {
			System.out.println(s);
		}
		System.out.println("------------");
		for (String s : newClockTypes) {
			System.out.println(s);
		}
		
		
	}

}
