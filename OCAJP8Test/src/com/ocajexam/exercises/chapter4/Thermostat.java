package com.ocajexam.exercises.chapter4;

public class Thermostat {
	int temperatureTrigger;
	boolean isOn;
	
	public boolean isOn() {
		return isOn;
	}
	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	int getTemperatureTrigger() {
		return temperatureTrigger;
	}
	public void setTemperatureTrigger (int temperatureTrigger) {
		this.temperatureTrigger = temperatureTrigger;
	}
}
