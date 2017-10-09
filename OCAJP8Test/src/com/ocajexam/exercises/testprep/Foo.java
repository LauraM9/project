package com.ocajexam.exercises.testprep;

class Foo {
	public Foo() {
		System.out.print("Foo");
	}
	public Foo(String str) {
		System.out.print("Foo" + str);
	}
}

class Bar extends Foo {
	public Bar(String str) {
		super();
		System.out.print("Bar");
	}
}
