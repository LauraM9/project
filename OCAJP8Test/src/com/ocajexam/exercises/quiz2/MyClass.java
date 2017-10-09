package com.ocajexam.exercises.quiz2;

public class MyClass {

	public static void main(String[] args) {
		String test = "OptionA\\OptionB";
		String myString[] = null;
		myString = test.split("\\\\");
		for (int i = 0; i < myString.length; i++) {
			System.out.println(myString[i]);
		}
	}

}
