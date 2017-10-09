package com.ocajexam.exercises.chapter4;

public class Arrays {
	
	enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES};

	public static void main(String[] args) {
		int[] testScore = new int[3];
		testScore[0] = 98;
		testScore[1] = 100;
		testScore[2] = 72;
		int shannonsTestScore = testScore[1];
		
		Suit cardSuit;
		cardSuit = Suit.CLUBS;
		if (cardSuit == Suit.CLUBS) {
			System.out.print("The suit of this card is clubs");
		}
		
		long creditCardNumber = 5555_5555_5555_5555L;
		int largeNumber = 1_000_000;
		float pi = 3.14_159_265f;
		
	}

}
