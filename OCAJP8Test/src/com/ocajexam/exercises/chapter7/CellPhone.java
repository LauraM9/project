package com.ocajexam.exercises.chapter7;

public class CellPhone implements Phone {
	
	private boolean callInProgress;

	@Override
	public void dialNumber(int number) {
		// Dial number via cell network

	}

	@Override
	public boolean isCallingInProgress() {
		return callInProgress;
	}

}
