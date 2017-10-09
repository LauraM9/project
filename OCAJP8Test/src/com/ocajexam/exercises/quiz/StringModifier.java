package com.ocajexam.exercises.quiz;

public class StringModifier {

	public static void main(String[] args) {
		String a = "supercalifragilisticexpialidocious!";
		String b = a.substring(9, 15);
		char[] c = {a.charAt(3), a.charAt(34)};
		System.out.println(b + String.valueOf(c));
	}

}
