package com.ocajexam.exercises.chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WaterApp {
	public static void main(String[] args) {
		Water hardWater = new Water("Hard");
		Water softWater = new Water("Soft");
		Water boiledWater = new Water("Boiled");
		Water rawWater = new Water("Raw");
		Water rainWater = new Water("Rain");
		Water snowWater = new Water("Snow");
		Water filteredWater = new Water("Filtered");
		Water reverseOsmosisWater = new Water("Reverse Osmosis");
		Water deionizedWater = new Water("Deionized");
		Water distilledWater = new Water("Distilled");
		
		List<Water> waterList = new ArrayList<>();
		waterList.add(hardWater);
		waterList.add(softWater);
		waterList.add(boiledWater);
		waterList.add(rawWater);
		waterList.add(rainWater);
		waterList.add(snowWater);
		waterList.add(filteredWater);
		waterList.add(reverseOsmosisWater);
		waterList.add(deionizedWater);
		waterList.add(distilledWater);
		
		System.out.println("Not sorted: " + waterList);
//		With separate class
//		WaterSort waterSort = new WaterSort();
//		Collections.sort(waterList, waterSort);
		
//		With anonymous inner class
//		Comparator<Water> waterSort = new Comparator<Water>() {
//			@Override
//			public int compare(Water w1, Water w2) {
//				return w1.getSource().compareTo(w2.getSource());
//			}
//		};
		System.out.println("Using lambda expression:");
//		With lambda expression
//		Comparator<Water> waterSort = (Water w1, Water w2) -> w1.getSource().compareTo(w2.getSource());
//		Collections.sort(waterList, waterSort);
		
//		With simplified lambda expression
//		Collections.sort(waterList, (/*Water */w1, /*Water*/ w2) -> w1.getSource().compareTo(w2.getSource()));
		
//		Even more simplified lambda expression
		waterList.sort(Comparator.comparing(w -> w.getSource()));
		
		System.out.println("Sorted: " + waterList);
	}
}
