package com.ocajexam.exercises.quiz1;

public class Animal {

		static int height = 10;
		public static void main(String[] args) {
			Mammal gorilla = new Mammal("gorilla");
			height = 30;
			System.out.println(gorilla.name);
			System.out.println(gorilla.height);
		}
}

class Mammal extends Animal {
	String name;
	Mammal(String mammalName) {
		name = mammalName;
	}
}