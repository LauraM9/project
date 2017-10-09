package com.ocajexam.exercises.chapter7;

public class Rose extends Plant {
	
	private static final int AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON = 1;
	
	private void grow() {
		int currentHeight = getHeight();
		setHeight(currentHeight + AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON);
	}
	
	private void dieDownForWinter() {
		setHeight(0);
	}

	@Override
	public void doSpring() {
		grow();
		addYearToAge();
		System.out.println("Spring: The rose is starting to grow up from the ground");
		System.out.println("\tCurrent Age: " + getAge() + " Current Height: " + getHeight());
	}

	@Override
	public void doSummer() {
		System.out.println("Summer: The rose has stoped growing and is flowering");
		System.out.println("\tCurrent Age: " + getAge() + " Current Height: " + getHeight());
	}

	@Override
	public void doFall() {
		System.out.println("Fall: The rose begins to wilt");
		System.out.println("\tCurrent Age: " + getAge() + " Current Height: " + getHeight());
	}

	@Override
	public void doWinter() {
		dieDownForWinter();
		System.out.println("Winter: The rose is dormant underground");
		System.out.println("\tCurrent Age: " + getAge() + " Current Height: " + getHeight());
	}

}
