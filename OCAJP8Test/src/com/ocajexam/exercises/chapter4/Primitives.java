package com.ocajexam.exercises.chapter4;

import java.text.NumberFormat;

public class Primitives {

	public static void main(String[] args) {
		char c1 = 'S'; // S as a character
		char c2 = '\u0068'; // h in Unicode
		char c3 = 0x0065; // e in hexadecimal
		char c4 = 0154; // 1 in octal
		char c5 = (char) 131170; // b; from cast to 98
		char c6 = (char) 131193; // y; from cast to 121
		char c7 = '\''; // ' apostrophe special character
		char c8 = 's'; // s as a character
		char[] autoDesignerArray = {c1, c2, c3, c4, c5, c6, c7, c8};
		
		char c9 = (char) 98;
//		System.out.println(c9);
		
//		System.out.print(new String(autoDesignerArray) + " Mustang"); // Shelby's Mustang
		
		byte passengers = 4; // implicit cast from integer to byte
		byte doors = (byte) 2; // explicit cast from integer to byte
		
		short unladenWeightInLbs = 2350; // implicit cast to two bytes
		short capacityInCu = (short) 427; // explicit cast to two bytes
		
		int auctionPrice = 7800000;
		
		char cylinders = '\u0008';
		int cyl = cylinders; // implicit cast from char to integer
		
		byte wheelbase = 90;
		int wBase = wheelbase; // implicit cast from byte to integer
		
		short horsepower = 250;
		int hPower = horsepower; // implicit cast from short to integer
		
		int length = (int) 151.5F; // floats must be explicitly casted
		int powerToHeightRatio = (int) 405.1D; // doubles must be explicitly casted
		
		long mustangBingResults = 146000000L;
		long mustangGoogleResults = 40500000l;
		/* explicit cast to long */
		long mustangAmazonBookResults = (long) 5774;
		/* implicit cast to long */
		long mustangAmazonManualResults = 2380;
		
		float currentBid = 80100.99F;
		float openingBid = 20000.00f;
		float reservePrice = (float) 92000;
		float myBid = 36000; // implicit cast from integer to float
		
		double leafSpringCobraEngine = 4.7D;
		double chyrsler331Engine = 5.4d;
		double ford427Engine = (double) 7;
		double ford428Engine = 7.01;
		double fordV8Engine = 5; // implicit cast from integer to double
		
		float a = 19801216.0f;
		float b = 20120307.12f;
		float c = a + b;
		// Format the float into US Currency format
		String d = NumberFormat.getCurrencyInstance().format(c);
		System.out.println(d);
		// Print the number directly as it is stored
		System.out.println(c);
		
		// More precision with double
		double x = 19801216.0;
		double y = 20120307.12;
		double z = x + y;
		// Format the float into US Currency format
		String s = NumberFormat.getCurrencyInstance().format(z);
		System.out.println(s);
		// Print the number directly as it is stored
		System.out.println(z);
	}

}
