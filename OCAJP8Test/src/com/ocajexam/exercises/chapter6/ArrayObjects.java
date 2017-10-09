package com.ocajexam.exercises.chapter6;

import java.util.ArrayList;

public class ArrayObjects {

	public static void main(String[] args) {
		Integer integer1 = new Integer(1300);
		Integer integer2 = new Integer(2000);
		
		ArrayList<Integer> basicArrayList = new ArrayList<>();
		basicArrayList.add(integer1);
		basicArrayList.add(integer2);
		
//		System.out.println(basicArrayList.get(0) + " - " + basicArrayList.get(1));
//		System.out.println("Size: " + basicArrayList.size());
		
		ArrayList<Integer> withCapacity = new ArrayList<>(3);
		withCapacity.add(34);
		withCapacity.add(56);
		withCapacity.add(5);
		withCapacity.add(0);
//		System.out.println("withCapacity size: " + withCapacity.size());
		
		withCapacity.ensureCapacity(2);
//		for (Integer i : withCapacity) {
//			System.out.println("i: " + i);
//		}
		
		Integer integer3 = new Integer(900);
		basicArrayList.add(1, integer3);
		System.out.println(basicArrayList.get(0) + " - " + basicArrayList.get(1) + " - " + basicArrayList.get(2));
		System.out.println("Size: " + basicArrayList.size());
		
		basicArrayList.remove(0);
		System.out.println(basicArrayList.get(0) + " - " + basicArrayList.get(1));
		System.out.println("Size: " + basicArrayList.size());
		
	}

}
