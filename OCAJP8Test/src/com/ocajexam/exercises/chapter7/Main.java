package com.ocajexam.exercises.chapter7;

public class Main {
	public static void main(String[] args) {
		Dog2 dog = new Dog2();
		dog.bark();
		dog.eat();
		
//		System.out.println("Starting...");
//		System.out.println("Creating a bicycle...");
//		Bicycle b = new Bicycle();
//		b.setDegreeOfTurn(0);
//		b.pedalRPM(50);
//		System.out.println("Truning: " + b.getDegreeOfTurn());
//		System.out.println("Wheel RPM: " + b.getWheelRPM());
//		
//		System.out.println("Creating a 10 speed bicycle...");
//		TenSpeedBicycle tb = new TenSpeedBicycle();
//		tb.setDegreeOfTurn(10);
//		tb.setGearRatio(3f);
//		tb.pedalRPM(40);
//		System.out.println("Truning: " + tb.getDegreeOfTurn());
//		System.out.println("Wheel RPM: " + tb.getWheelRPM());
		
		System.out.println("Creating a maple tree, a tulip and a rose...");
		MapleTree mapleTree = new MapleTree();
		Tulip tulip = new Tulip();
		Rose rose = new Rose();
		System.out.println("Entering a loop to simulate 3 years");
		for (int i = 0; i < 3; i++) {
			mapleTree.doSpring();
			tulip.doSpring();
			rose.doSpring();
			
			mapleTree.doSummer();
			tulip.doSummer();
			rose.doSummer();
			
			mapleTree.doFall();
			tulip.doFall();
			rose.doFall();
			
			mapleTree.doWinter();
			tulip.doWinter();
			rose.doWinter();
		}
	}
}
