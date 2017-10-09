package com.ocajexam.exercises.chapter2;

import java.util.ArrayList;
import java.util.List;

public class Iterations {
	
	public static void main(String[] args) {
		
		int hookSizes[] = {1, 1, 1, 2, 2, 4, 5, 5, 5, 6, 7, 8, 8, 9};
		for (int hook : hookSizes) System.out.print(hook + " ");
		
		List<Integer> hookSizesList = new ArrayList<>();
		hookSizesList.add(1);
		hookSizesList.add(4);
		hookSizesList.add(5);
		for (Integer hook : hookSizesList) System.out.print(hook + " ");
		
		System.out.println();
		
		List<Float> fishLengthList = new ArrayList<>();
		fishLengthList.add(10.0F);
		fishLengthList.add(15.5F);
		fishLengthList.add(18.0F);
		fishLengthList.add(29.5F);
		fishLengthList.add(45.5F);
		for (Float fish : fishLengthList) {
			if (fish > 28) {
				System.out.print(fish + " ");
			}
		}
		
	}

}
