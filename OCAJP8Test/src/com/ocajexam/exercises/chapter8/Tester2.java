package com.ocajexam.exercises.chapter8;

public class Tester2 {

	public static void main(String[] args) throws Exception {
		new Tester2();
	}

	public Tester2() throws Exception {
		Logger logger = new Logger();
		SystemStatus systemStatus = new SystemStatus();
		NetworkConnection networkConnection = new NetworkConnection();
		
		logger.appendToLog(systemStatus);
		logger.appendToLog(networkConnection);
		
		networkConnection.connect();
		Thread.sleep(2000);
		
		logger.appendToLog(systemStatus);
		logger.appendToLog(networkConnection);
		logger.close();
	}
	
}
