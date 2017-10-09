package com.ocajexam.exercises.chapter8;

public class Tester {

	public static void main(String[] args) {
		new Tester();
	}

	public Tester() {
		Phone landLinePhone = new Phone();
		SmartPhone smartPhone = new SmartPhone();
		
		System.out.println("About to test a landline phone as a phone...");
		testPhone(landLinePhone);
		
		System.out.println("\nAbout to test a smart phone phone as a phone...");
		testPhone(smartPhone);
		
		System.out.println("\nAbout to test a smart phone phone as a smart phone...");
		testSmartPhone(smartPhone);
	}
	
	private void testPhone(Phone phone) {
		phone.callNumber(555986447L);
		phone.isRinging();
	}
	
	private void testSmartPhone(SmartPhone phone) {
		phone.sendEmail("Hi", "edward@ocajexam.com");
		phone.retrieveEmail();
	}
}
