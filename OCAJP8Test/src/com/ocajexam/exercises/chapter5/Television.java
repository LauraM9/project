package com.ocajexam.exercises.chapter5;

public class Television {
	
	int channel = 0;
	boolean on = false;
	
	void setChannel(int channelValue) {
		this.channel = channelValue;
	}
	
	int getChannel() {
		return this.channel;
	}
	
	void setOn(boolean on) {
		this.on = on;
	}
	
	boolean isOn() {
		return this.on;
	}

}
