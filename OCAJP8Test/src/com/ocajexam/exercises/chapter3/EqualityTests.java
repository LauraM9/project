package com.ocajexam.exercises.chapter3;

public class EqualityTests {

	public static void main(String[] args) {
		Integer value1 = new Integer("312");
		Integer value2 = new Integer("312");
		Object object1 = new Object();
		Object object2 = new Object();
		Object object3 = value1;
		
		System.out.println("A) " + value1.equals(value2));
		System.out.println("B) " + value1.equals(object1));
		System.out.println("C) " + value1.equals(object3));
		System.out.println("D) " + object1.equals(object2));
		
//		System.out.println(true | false & true + ","); compilation error
		System.out.println(false & true | true);
		
		int score = 10;
		System.out.println("score: " + score++);
		
	}

}
