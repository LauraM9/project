package com.ocajexam.exercises.appendixA;

public class TrafficSimulator {
	
	Car[] cars = new Car[3];
	TrafficLight[] trafficLights = new TrafficLight[8];

	public static void main(String[] args) {

	}

	TrafficSimulator() {
		for (int i = 0; i < trafficLights.length; i++) {
			trafficLights[i] = new TrafficLight(i);
		}
		cars[0] = new Car(trafficLights);
		cars[1] = new Car(trafficLights);
		cars[2] = new Car(trafficLights);
	}
}
