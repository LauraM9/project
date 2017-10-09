package com.ocajexam.exercises.chapter2;

import java.util.HashMap;

public class SelfTest {

	public static void main(String[] args) {
		int x = 1;
		String result = (x <= 1) ? "We are set for takeoff. " : "Launch aborted!";
		System.out.println("result: " + result);
		
		int cartWheelsInAMinute = 30;
		if (cartWheelsInAMinute > 48) {
			System.out.println("New world record!");
		} else if (cartWheelsInAMinute > 30 && cartWheelsInAMinute <= 48) {
			System.out.println("Awesome job!");
		} else if (cartWheelsInAMinute > 0 && cartWheelsInAMinute <= 30) {
			System.out.println("Still impresive!");
		} else {
			System.out.println("Keep trying!");
		}
		
		boolean isValid = true;
		while (isValid) {
			isValid = false;
			System.out.print("test1 ");
			if (isValid = true) {
				System.out.println("test2 ");
				break;
			}
			isValid = false;
			System.out.println("test3");
		}
		
		HashMap<String, String> leftHand = new HashMap<>();
		leftHand.put("Thumb", null);
		leftHand.put("Index finger", "Puzzle Ring");
		leftHand.put("Middle finger", null);
		leftHand.put("Ring finger", "Engagement Ring");
		leftHand.put("Little finger", "Pinky Ring");
		for (String s : leftHand.keySet()) {
			System.out.println("Verifying " + s);
			if (s.equals("Little finger")) {
				System.out.println(s + " had a " + leftHand.get(s));
				leftHand.put("Little finger", "Engineer's Ring");
				System.out.println(s + " has an " + leftHand.get(s));
				break;
			}
		}
	}

}
