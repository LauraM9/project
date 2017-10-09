package com.ocajexam.exercises.chapter8;

public class Sheep implements Describable {
	
	private String description;
	
	public Sheep (String name) {
		description = "A sheep named " + name;
	}

	@Override
	public String getDescription() {
		return description;
	}

}
