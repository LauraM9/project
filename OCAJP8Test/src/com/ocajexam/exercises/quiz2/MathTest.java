package com.ocajexam.exercises.quiz2;

public class MathTest {

	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		int z = 0;
		MyMath obj = new MyMath();
		z = obj.addTwo(x, y);
//		z = MyMath.addTwo(x, y);
		System.out.println("z = " + z);
	}
}

class MyMath {
	public static int addTwo(int a, int b) {
		return a + b;
	}
}