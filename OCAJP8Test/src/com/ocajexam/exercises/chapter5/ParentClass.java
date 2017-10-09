package com.ocajexam.exercises.chapter5;

public class ParentClass {
	public ParentClass() {
		System.out.println("ParentClass Constructor");
	}
	public ParentClass(String s) {
		System.out.println("ParentClass Constructor " + s);
	}
	
	public String className() {
		return " ParentClass ";
	}
}
