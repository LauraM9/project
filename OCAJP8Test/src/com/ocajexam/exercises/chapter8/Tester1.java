package com.ocajexam.exercises.chapter8;

public class Tester1 {

	public static void main(String[] args) {
		new Tester1();
	}

	public Tester1() {
		Goat goat = new Goat("Bob");
		GoatShelter goatShelter = new GoatShelter(4, 4, 6);
		Sheep sheep = new Sheep("Mioritza");
		
		System.out.println(description(goat));
		System.out.println(description(goatShelter));
		System.out.println(description(sheep));
	}
	
	private String description(Describable d) {
		return d.getDescription();
	}

}
