package com.ocajexam.exercises.quiz;

public class Person {
	
	private String name = "Antoinette";
	public Person(String name) {
		System.out.println(this.name + " " + name);
	}

	public static void main(String[] args) {
		Person p = new Person("Toni");
	}

}
