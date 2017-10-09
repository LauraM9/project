package com.ocajexam.exercises.chapter2;

import java.util.Random;

enum ClamBait {FRESH, SALTED, ARTIFICIAL};

public class SwitchStatement {
	
	public static String generateRandomFish() {
		String randomFish;
		Random randomObject = new Random();
		int randomNumber = randomObject.nextInt(4);
		switch (randomNumber) {
		case 0:
			randomFish = "Blue Fish";
			break;
		case 1:
			randomFish = "Red Drum";
			break;
		case 2:
			randomFish = "Striped Bass";
			break;
		default:
			randomFish = "Unknown Fish Type";
			break;
		}
		return randomFish;
	}

	public static void main(String[] args) {
		System.out.println(generateRandomFish());
		
		ClamBait bait = ClamBait.SALTED;
		switch (bait) {
		default:
			System.out.println("No bait");
			break;
		case FRESH:
			System.out.println("Fresh clams");
			break;
		case SALTED:
			System.out.println("Salted clams");
			break;
		case ARTIFICIAL:
			System.out.println("Artificial clams");
			break;
		}
	}

}
