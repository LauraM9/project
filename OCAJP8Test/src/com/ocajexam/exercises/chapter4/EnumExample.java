package com.ocajexam.exercises.chapter4;

public class EnumExample {
	enum TypeOfShoe {RUNNING, BASKETBALL, CROSS_TRAINING}
	TypeOfShoe shoe;
	void createRunningShoes() {
		shoe = TypeOfShoe.RUNNING;
	}
}
