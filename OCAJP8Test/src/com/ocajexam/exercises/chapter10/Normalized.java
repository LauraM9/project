package com.ocajexam.exercises.chapter10;

import java.time.Period;

public class Normalized {

	public static void main(String[] args) {
		Period p1 = Period.parse("P0Y13M");
		System.out.println("Original: " + p1 + " Normalized: " + p1.normalized());
		
		Period p2 = Period.parse("P2Y-1M");
		System.out.println("Original: " + p2 + " Normalized: " + p2.normalized());
	}

}
