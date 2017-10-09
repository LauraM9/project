package com.ocajexam.exercises.chapter7;

public class LandlinePhone implements Phone {
	
	private boolean callInProgress;

	@Override
	public void dialNumber(int number) {
		// Dial number via wired network
	}

	@Override
	public boolean isCallingInProgress() {
		return callInProgress;
	}

}
