package com.ocajexam.exercises.chapter8;

public class SmartPhone extends Phone { 
	
	public void sendEmail(String message, String address) {
		System.out.println("SmartPhone: Sending Email");
	}
	
	public String retrieveEmail() {
		System.out.println("SmartPhone: Retrieving Email");
		String message = new String();
		return message;
	}
	
	public boolean isRinging() {
		System.out.println("SmartPhone: Checking if phone is ringing");
		boolean ringing = false;
		return ringing;
	}
}
