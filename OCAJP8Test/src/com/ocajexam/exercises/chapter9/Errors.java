package com.ocajexam.exercises.chapter9;

import java.util.ArrayList;

public class Errors {
	
	public void forceStackOverFlowError() {
		Integer counter = 0;
		ArrayList<Integer> unstoppable = new ArrayList<>();
		while (true) {
			unstoppable.add(counter);
			counter++;
			if (counter % 10_000 == 0) {
				System.out.println(counter);
			}
		}
	}
	
	public void forceAssertionError() {
		int i = 0;
		assert i != 0 : "i must not be zero";
	}
	
	public static void main(String[] args) {
		Errors e = new Errors();
//		e.forceStackOverFlowError();
		e.forceAssertionError();
	}
}
