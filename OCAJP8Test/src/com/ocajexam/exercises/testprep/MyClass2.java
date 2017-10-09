package com.ocajexam.exercises.testprep;

public class MyClass2 {
	public static void main(String[] args) {
		Double num = 2.0;
		
		MyClass2 myClass2 = new MyClass2();
		TestMyClass2 testMyClass2 = new TestMyClass2();
		
		myClass2.number(testMyClass2);
		System.out.println(testMyClass2.num);
	}
	void number(TestMyClass2 testMyClass2) {
		System.out.println(testMyClass2.num);
		testMyClass2.num = testMyClass2.num * testMyClass2.num;
	}
}

class TestMyClass2 {
	Double num = 3.0;
}
