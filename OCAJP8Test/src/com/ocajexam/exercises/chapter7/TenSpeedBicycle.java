package com.ocajexam.exercises.chapter7;

public class TenSpeedBicycle extends Bicycle {
	private float gearRatio = 2f;
	private float wheelRPM;
	
	public float getWheelRPM() {
		return wheelRPM;
	}
	public void setGearRatio(float gearRatio) {
		this.gearRatio = gearRatio;
	}
	
	public void pedalRPM(float pedalRPM) {
		this.wheelRPM = pedalRPM * gearRatio;
	}
}
