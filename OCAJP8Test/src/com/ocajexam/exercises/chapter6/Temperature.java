package com.ocajexam.exercises.chapter6;

import java.util.ArrayList;

public class Temperature {

	public static void main(String[] args) {
		int[] dailyTemperature = new int[7];
		dailyTemperature[0] = 30;
		dailyTemperature[1] = 31;
		dailyTemperature[2] = 29;
		dailyTemperature[3] = 35;
		dailyTemperature[4] = 27;
		dailyTemperature[5] = 32;
		dailyTemperature[6] = 30;
		int sumStandard = 0;
		for (int i = 0; i < 7; i++) {
			sumStandard += dailyTemperature[i];
		}
		System.out.println("(standard) avg: " + sumStandard / 7);
		
		ArrayList<Integer> dailyTemp = new ArrayList<>();
		dailyTemp.add(30);
		dailyTemp.add(31);
		dailyTemp.add(29);
		dailyTemp.add(35);
		dailyTemp.add(27);
		dailyTemp.add(32);
		dailyTemp.add(30);
		int sumArrayList = 0;
		for (Integer t : dailyTemp) {
			sumArrayList += t;
		}
		System.out.println("(array list) avg: " + sumArrayList / 7);
	}

}
