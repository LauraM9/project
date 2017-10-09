package com.ocajexam.exercises.chapter5;

public class MathTools {

	public int findLowerValue(int number1, int number2) {
		int result;
		if (number1 < number2) {
			result = number1;
		} else {
			result = number2;
		}
		return result;
	}

	public double findLowerValue(double number1, double number2) {
		double result;
		if (number1 < number2) {
			result = number1;
		} else {
			result = number2;
		}
		return result;
	}

	void addTwo(int value) {
		System.out.println("Parameter: value = " + value);
		value = value + 2;
		System.out.println("Leaving method: value = " + value);
	}
	
	void addThree(Number value) {
		System.out.println("Parameter: value = " + value.getNumber());
		value.setNumber(value.getNumber() + 3);
		System.out.println("Leaving method: value = " + value.getNumber());
	}
	
	float findMilesPerHour(float milesTraveled, float hoursTraveled) { // method parameters
		return milesTraveled / hoursTraveled;
	}

}
