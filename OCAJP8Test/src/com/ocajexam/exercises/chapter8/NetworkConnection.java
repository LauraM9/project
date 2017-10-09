package com.ocajexam.exercises.chapter8;

public class NetworkConnection implements Logable {

	private long createdTimestamp;
	private String currentLogMessage;
	
	public NetworkConnection() {
		createdTimestamp = System.currentTimeMillis();
		currentLogMessage = "Initialized";
	}
	
	public void connect() {
		currentLogMessage = "Connected at " + System.currentTimeMillis();
	}

	@Override
	public String getInitInfo() {
		return "NetworkConnection object created " + createdTimestamp;
	}

	@Override
	public String getLogableEvent() {
		return currentLogMessage;
	}

}
