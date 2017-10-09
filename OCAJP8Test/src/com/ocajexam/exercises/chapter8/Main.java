package com.ocajexam.exercises.chapter8;

public class Main {

	public static void main(String[] args) {
		double detailedScore = 1.2;
		float score = (float) detailedScore;
		System.out.println("Float: " + score);
		
		int i = 1236;
		byte b = (byte) i;
		System.out.println("Byte: " + b);
		
		int ii = 8;
		Integer obj1 = new Integer(ii);
		Integer obj2 = (Integer) ii;
		Integer obj3 = ii;
		Float obj4 = 5.7f;
//		Integer obj5 = obj4; not ok
		
		ClassB objb1 = new ClassB();
		ClassA obja2 = new ClassB();
		ClassA obja3 = new ClassA();
		
		System.out.println("objb1: " + objb1.whoAmI());
		System.out.println("obja2: " + obja2.whoAmI());
		System.out.println("obja3: " + obja3.whoAmI());
		
		ClassB objb4 = (ClassB) obja2;
		System.out.println("objb4: " + objb4.specialClassBMethod());
		System.out.println("objb4: " + ((ClassB)objb4).specialClassBMethod());
		
		Car car = new Car();
		Vehicle vehicle = car;
		
		Truck truck = new Truck();
		Drivable drivable = truck;
		
		Tractor tractor = new Tractor();
//		Vehicle vehicle2 =  tractor; not ok
		
		Vehicle vehicle2 = new Vehicle();
		
		Object object = truck;
		
	}

}
