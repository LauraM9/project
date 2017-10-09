package com.ocajexam.exercises.chapter5;

public class ChildClass extends ParentClass {
	
	public ChildClass() {
		System.out.println("ChildClass Constructor");
	}
	public ChildClass(String s) {
		super(s);
		System.out.println("ChildClass Constructor " + s);
	}
	
	public String className() {
		return "ChildClass -> " + super.className();
	}
}
