package com.ocajexam.exercises.quiz;

public class ClassB extends ClassA {
	public ClassB() {
		System.out.println(super.className());
	}
	public String className() {
		return "ClassB";
	}
}
