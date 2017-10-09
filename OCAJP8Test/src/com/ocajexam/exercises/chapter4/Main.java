package com.ocajexam.exercises.chapter4;

import com.ocajexam.exercises.chapter5.SampleClass;

public class Main {
	
	public double interestDue(double currentBalance, float interestRate) {
		double interestDue = currentBalance * interestRate;
		return interestDue;
	}

	public static void main(String[] args) {
		Car bigCar;
		bigCar = new Car(125, true);
		boolean running = bigCar.isRunning();
		
		Car smallCar;
		smallCar = bigCar;
		boolean running1 = smallCar.isRunning();
		
		Car oldCar;
//		boolean running2 = oldCar.isRunning(); // illegal
		
		Car yourCar = new Car(230, true);
		System.out.println(yourCar.isRunning());
		System.out.println(yourCar.getTopSpeed());
		
		Thermostat houseThermostat = new Thermostat();
		houseThermostat.setTemperatureTrigger(68);
		System.out.println(houseThermostat.getTemperatureTrigger());
		
		int intArray[] = new int[5];
		int[] intArray1 = new int[5];
		
		Short g;
//		Float h = g.floatValue(); not ok 
		
		float x = (float) 0.0;
		int y = 5;
		long z;
		x = y + 3.3f;
//		x = x + z; not ok
		
	}

}
