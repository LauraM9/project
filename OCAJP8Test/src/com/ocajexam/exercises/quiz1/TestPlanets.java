package com.ocajexam.exercises.quiz1;

public class TestPlanets {

	public static void main(String[] args) {
		Planet earth = new Earth();
		System.out.println(earth.rotation());
	}
}

class Planet {
	int distanceFromSun;

	Planet() {
		System.out.println("This is a planet");
	}

	Planet(int pDistance) {
		distanceFromSun = pDistance;
	}

	String rotation() {
		return "A planet rotates";
	}
}

class Earth extends Planet {
	String rotation() {
		return "The Earth rotates once every 24 hours";
	}
}

class Jupiter extends Planet {
	String rotation() {
		return "Jupiter rotates once every 24 hours";
	}
}
