package com.ocajexam.exercises.chapter3;

public class BooleanResultsOutput {

	public static void main(String[] args) {
		boolean booleanValue1 = true;
		boolean booleanValue2 = false;
		System.out.print(!(booleanValue1 & !booleanValue2) + ", ");
		System.out.print(!(booleanValue1 | !booleanValue2) + ", ");
		System.out.print(!(booleanValue1 ^ !booleanValue2));
	}

}
