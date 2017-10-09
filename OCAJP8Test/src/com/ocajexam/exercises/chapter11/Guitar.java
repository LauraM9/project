package com.ocajexam.exercises.chapter11;

public class Guitar {

	public static void main(String[] args) {
		Strummable instrument = () -> {System.out.println("strummed!");};
		instrument.strum();
	}
	@FunctionalInterface
	interface Strummable {
		void strum();
	}

}
