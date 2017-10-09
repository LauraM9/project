package com.ocajexam.exercises.chapter3;

public class RelationalOperators {

	public static void main(String[] args) {
		boolean b1 = 1 < 2; // System.out.println("b1 = " + b1);
		boolean b2 = 3 < 2; // System.out.println("b2 = " + b2);
		boolean b3 = 3 > 2; // System.out.println("b3 = " + b3);
		boolean b4 = 1 > 2; // System.out.println("b4 = " + b4);
		boolean b5 = 2 <= 2; // System.out.println("b5 = " + b5);
		boolean b6 = 3 <= 2; // System.out.println("b6 = " + b6);
		boolean b7 = 3 >= 3; // System.out.println("b7 = " + b7);
		boolean b8 = 2 >= 3; // System.out.println("b8 = " + b8);
		
		boolean bb1 = 'A' < 'B';       		//System.out.println("bb1 = " + b1); // Character literals
		boolean bb2 = '\u0041' < '\u0042'; 	//System.out.println("bb2 = " + b1); // Unicode literals
		boolean bb3 = 0x0041 < 0x0041; 		//System.out.println("bb3 = " + b1); // Hexadecimal literals
		boolean bb4 = 65 < 66; 				//System.out.println("bb4 = " + b1); // Integer literals that fit in a char
		boolean bb5 = 0101 < 0102; 			//System.out.println("bb5 = " + b1); // Octal literals
		boolean bb6 = '\101' < '\102';		//System.out.println("bb6 = " + b1); // Octal literals
		boolean bb7 = 'A' < 0102; 			//System.out.println("bb7 = " + b1); // Character and octal literals
		
		boolean b11 = 9.00D < 9.50D; 			//System.out.println("b11 = " + b11);
		boolean b22 = 9.00d < 9.50d; 			//System.out.println("b22 = " + b22);
		boolean b33 = 9.00F < 9.50F; 			//System.out.println("b33 = " + b33);
		boolean b44 = 9.0f < 9.50f; 			//System.out.println("b44 = " + b44);
		boolean b55 = (double)9 < (double)10; 	//System.out.println("b55 = " + b55);
		boolean b66 = (float)9 < (float)10; 	//System.out.println("b66 = " + b66);
		boolean b77 = 9 < 10; 					//System.out.println("b77 = " + b77);
		boolean b88 = (9d < 10f); 				//System.out.println("b88 = " + b88);
		boolean b99 = (float)11 < 12; 			//System.out.println("b99 = " + b99);
		
//		System.out.println(true == true);
//		System.out.println('a' != 'a');
//		System.out.println((byte)2 == (byte)2);
//		System.out.println((short)2 != (short)2);
//		System.out.println(5 == 5);
//		System.out.println(12F == 12f);
//		System.out.println(12D != 12d);
		
		float f = 0.1f;
		float sum;
		sum = 0;
		
		for (int i= 0; i < 10; ++i) {
			sum += f;
		}
		float product = f * 10;
		
//		System.out.printf("sum = %1.15f", sum);
//		System.out.println();
//		System.out.printf("mul = %1.15f", product);
//		System.out.println();
//		System.out.printf("mul2 = %1.15f", f * 10);
//		System.out.println();
//		
//		System.out.println("Math.ulp(sum) = " + Math.ulp(sum));
//		System.out.println("Math.ulp(product) = " + Math.ulp(product));
//		System.out.println("Math.ulp(5.0) = " + Math.ulp(5.0));
//		System.out.println("Math.ulp(5) = " + Math.ulp(5));
//		System.out.println("Math.ulp(0) = " + Math.ulp(0));
//		System.out.println("Math.ulp(Float.MAX_VALUE) = " + Math.ulp(Float.MAX_VALUE));
//		
//		System.out.println("Math.ulp(5) == Math.ulp(5.0) = " + (Math.ulp(5) == Math.ulp(5.0)));
//		System.out.println("Math.ulp(sum) == Math.ulp(product) = " + (Math.ulp(sum) == Math.ulp(product)));
//		System.out.println("Math.ulp(5.1937) == Math.ulp(5.19370) = " + (Math.ulp(5.1937) == Math.ulp(5.19370)));
		
//		Object a = new Object();
//		Object b = new Object();
//		Object c = b;
		
//		System.out.println("a == b -> " + (a == b));
//		System.out.println("a == c -> " + (a == c));
//		System.out.println("b == c -> " + (b == c));
//		System.out.println("a != b -> " + (a != b));
//		System.out.println("a != c -> " + (a != c));
//		System.out.println("b != c -> " + (b != c));
		
		double d = 0;
		int i = 0;
		Object dd = (double) d;
		Object ii = (int) i;
		
		System.out.println("dd.getClass(): " + dd.getClass());
		System.out.println("ii.getClass(): " + ii.getClass());
		
		if (dd instanceof Double && !(ii instanceof Double)) {
			double id = (double) i; 
		} else if (ii instanceof Double && !(dd instanceof Double)) {
			double ddd = (double) d;
		} else {
			System.out.println("There is no double primitive!");
		}
		
		boolean and1 = true && true; //System.out.println("and1 = " + and1);
		boolean and2 = true && false; //System.out.println("and2 = " + and2);
		boolean and3 = false && true; //System.out.println("and3 = " + and3);
		boolean and4 = false && false; //System.out.println("and4 = " + and4);
		
		boolean or1 = true || true; //System.out.println("or1 = " + or1);
		boolean or2 = true || false; //System.out.println("or2 = " + or2);
		boolean or3 = false || true; //System.out.println("or3 = " + or3);
		boolean or4 = false || false; //System.out.println("or4 = " + or4);
		
		
	}

}
