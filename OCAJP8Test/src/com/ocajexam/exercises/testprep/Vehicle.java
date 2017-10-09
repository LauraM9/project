package com.ocajexam.exercises.testprep;

class Vehicle {
	String make;
	String model;
	public Vehicle(String vMake, String vModel) {
		make = vMake;
		model = vModel;
	}
	public Vehicle() {};
}

class Van extends Vehicle {
	int seats;
	public Van(String make, String model, int vSeats) {
//		super(make, model);
		Vehicle vehicle = new Vehicle(make, model);
		seats = vSeats;
	}
}
