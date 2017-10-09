package com.ocajexam.exercises.chapter2;

public class ConditionalStatements {

	public static void main(String[] args) {
		/*boolean b;
		boolean bValue = (b = true);
		
		System.out.println("bValue = " + bValue);
		
		if (bValue) System.out.println("TRUE");
		else System.out.println("FALSE");
		
		if (bValue = false) System.out.println("TRUE");
		else System.out.println("FALSE");
		
		System.out.println("bValue = " + bValue);
		
		if (bValue == false) System.out.println("TRUE");
		else System.out.println("FALSE");*/
		
//		int pyramidSinker = 3;
//		System.out.print("A pyramid sinker that weighs " + pyramidSinker + " ounces is ");
//		if (pyramidSinker == 2) System.out.println("used for a slow moving tide. ");
//		if (pyramidSinker == 3) System.out.println("used for a moderate moving tide. ");
//		if (pyramidSinker == 4) System.out.println("used for a fast moving tide. ");
		
//		Boolean wrapperBoolean = new Boolean("true");
//		boolean primitiveBoolean1 = wrapperBoolean.booleanValue();
//		System.out.println("primitiveBoolean1 = " + primitiveBoolean1);
//		boolean primitiveBoolean2 = wrapperBoolean;
//		System.out.println("primitiveBoolean2 = " + primitiveBoolean2);
//		if (wrapperBoolean) System.out.println("Works because of unboxing");
		
		FishTest test = new FishTest();
		FishingSession fishingSession = new FishingSession();
		fishingSession.setSession("active");
		fishingSession.setBaitAvailable(false);
		int piecesOfBait = 5;
		piecesOfBait = 0; // Fox steals the bait
		while (piecesOfBait > 0) {
			test.castForFish();
//			Check to see if the bait is available
			if (fishingSession.isBaitAvailable() == false) {
				System.out.println("Bait is not available!");
				fishingSession.setBaitAvailable(true);
				piecesOfBait--;
			} else {
				System.out.println("Bait is available!");
			}
			
		}
		
	}

}
