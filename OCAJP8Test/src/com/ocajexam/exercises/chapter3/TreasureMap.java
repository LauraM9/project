package com.ocajexam.exercises.chapter3;

public class TreasureMap {
	
	private String owner = "Blackbeard";
	private String location = "Outer Banks";
	
	@Override
	public String toString() {
		return "TreasureMap [owner=" + owner + ", location=" + location + "]";
	}
	
	public static void main(String[] args) {
		TreasureMap t = new TreasureMap();
		System.out.println(t);
	}

}
