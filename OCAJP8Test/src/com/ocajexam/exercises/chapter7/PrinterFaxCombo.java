package com.ocajexam.exercises.chapter7;

import java.io.File;

public class PrinterFaxCombo implements Fax, Printer {
	
	private Object incomingFax;
	private int inkLevel;

	@Override
	public void printFile(File f) {
		sendFileToPrinter(f);
	}

	@Override
	public void sendFax(File f, int number) {
		dialNumber(number);
		faxFile(f);
	}

	@Override
	public Object getReceivedFaxes() {
		return incomingFax;
	}
	
	public int getInkLevel() {
		return inkLevel;
	}

	private boolean dialNumber(int number) {
		boolean success = true;
//		Dial number set success to false if it is not successful
		return success;
	}
	
	private void faxFile(File f) {
//		Send the file f as a fax
	}
	
	private void sendFileToPrinter(File f) {
//		Print the File f
	}

}
