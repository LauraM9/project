package com.ocajexam.exercises.chapter5;

public class Main {
	
	void sampleMethod() { // start of code block A
		int totalCount = 0;
		for (int i = 0; i < 3; i++) { // start of code block B
			int forCount = 0;
			totalCount++;
			forCount++;
			{ // start of code block C
				int block1Count = 0;
				totalCount++;
				forCount++;
				block1Count++;
			} // end of code block C
			{ // start of code block D
				int block2Count = 0;
				totalCount++;
				forCount++;
				block2Count++;
			} // end of code block D
			int block1Count;
			int block2Count;
		} // end of code block B
	} // end of code block A

	public static void main(String[] args) {
		
		MathTools mTools = new MathTools();
		int x = 8;
		int y = 13;
		int lowestInt = mTools.findLowerValue(x, y);
//		System.out.println("Result1: " + lowestInt);
//		System.out.println("Result2: " + mTools.findLowerValue(x, y));
		
		LogManager logManager = new LogManager();
//		logManager.logInfo("First log message", -299);
//		logManager.logInfo("Second log message");
		
		int value = 1;
//		System.out.println("\nArgument: value = " + value);
//		mTools.addTwo(value);
//		System.out.println("After method call: value = " + value);
		
		Number value1 = new Number(1);
//		System.out.println("\nArgument: value = " + value1.getNumber());
//		mTools.addThree(value1);
//		System.out.println("After method call: value = " + value1.getNumber());
		
		Television tv1 = new Television();
		Television tv2 = new Television();
		tv1.setChannel(2);
		tv2.setChannel(7);
//		System.out.println("Television channel for tv1: " + tv1.getChannel());
//		System.out.println("Television channel for tv2: " + tv2.getChannel());
		
		LoanDetails ld = new LoanDetails();
		ld.setPrincipal(150000);
//		System.out.println("Payment 1: " + ld.monthlyPayment());
		
		LoanDetails secondLD = new LoanDetails(10, .025, 125000);
//		System.out.println("Payment 2: " + secondLD.monthlyPayment());
		
//		ChildClass childClass1 = new ChildClass();
//		ChildClass childClass2 = new ChildClass("test");
		
//		System.out.println(childClass1.className());
		
//		System.out.println(Tools.formatDate());
		
		ShippingPackage packageOne = new ShippingPackage();
		ShippingPackage packageTwo = new ShippingPackage();
		ShippingPackage packageThree = new ShippingPackage();
		
//		System.out.println("Package One Tracking Number: " + packageOne.getPackageTrackingNumber());
//		System.out.println("Package Two Tracking Number: " + packageTwo.getPackageTrackingNumber());
//		System.out.println("Package Three Tracking Number: " + packageThree.getPackageTrackingNumber());
//		
//		System.out.println("Next Tracking Number: " + ShippingPackage.nextTrackingNumber);
//		
//		System.out.println(Math.PI);
		
		SampleClass s = new SampleClass(5);
		System.out.println("size = " + s.getSize());
//		s.sampleMethod(4.4, 4);
		
		FloatNumber floatNumber = new FloatNumber(1f);
		s.addHalf(floatNumber);
//		System.out.println("value = " + floatNumber.getNumber());
		int number = 7;
		s.sampleMethod1(number);
//		System.out.println("number = " + number);
		
		SampleClass x1 = new SampleClass();
		SampleClass y1 = new SampleClass();
		x1.increaseCount();
		System.out.println(x1.getCurrentCount());
		
	}

}
