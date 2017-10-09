package com.ocajexam.exercises.chapter5;

import java.util.ArrayList;

public class Methods {
	
	public boolean isActive() {return true;}
	public int getCurrentTotal() {return 5;}
	public void processPendingData() {/*Method Body*/}
	
	public ArrayList getAllAccounts() {return new ArrayList<>();}
	
	public int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public void printString(String stringToPrint) {
		System.out.println(stringToPrint);
	}
}
