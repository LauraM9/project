package com.ocajexam.exercises.chapter3;

public class AritmeticOperators {

	public static void main(String[] args) {
		int greyCannonBalls = 50;
		int blackCannonBalls = 50;
		int totalCannonBalls = greyCannonBalls + blackCannonBalls;
//		System.out.println("totalCannonBalls = " + totalCannonBalls);
		
		int firedCannonBalls = 10;
		totalCannonBalls = totalCannonBalls - firedCannonBalls;
//		System.out.println("totalCannonBalls after some being fired = " + totalCannonBalls);
		
		int matches = 20;
		int matchboxes = 20;
		int totalMatches = matches * matchboxes;
//		System.out.println("totalMatches = " + totalMatches);
		
		int pirates = 104;
		int pirateShips = 3;
		int assignedPiratesPerShip = pirates / pirateShips;
//		System.out.println("assignedPiratesPerShip = " + assignedPiratesPerShip);
		
		int pirateReminder = pirates % pirateShips;
//		System.out.println("pirateReminder = " + pirateReminder);
		
		int x = 10;
		int y = ++x;
		System.out.println("x = " + x + ", y = " + y);
		
		int x1 = 10;
		int y1 = x1++;
		System.out.println("x1 = " + x1 + ", y1 = " + y1);
		
		int x2 = 10;
		int y2 = --x2;
		System.out.println("x2 = " + x2 + ", y2 = " + y2);
		
		int x3 = 10;
		int y3 = x3--;
		System.out.println("x3 = " + x3 + ", y3 = " + y3);
		
	}

}
