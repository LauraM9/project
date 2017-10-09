package com.ocajexam.exercises.chapter4;

public class Car {
	int topSpeed;
	boolean running;
	
	public Car(int topSpeed, boolean running) {
		this.topSpeed = topSpeed;
		this.running = running;
	}
	
	public boolean isRunning() {
		return running;
	}
	
	public int getTopSpeed() {
		return topSpeed;
	}
	
}
