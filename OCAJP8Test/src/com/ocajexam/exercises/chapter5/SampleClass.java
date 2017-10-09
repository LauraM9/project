package com.ocajexam.exercises.chapter5;

public class SampleClass {
	
	private int size;
	private int priority;
	private static int currentCount = 0;
	
	public SampleClass() {
//		this(1);
//		System.out.println("Using default values");
		currentCount++;
	}
	
	public void increaseCount() {
		currentCount++; 
	}
	
	public SampleClass(int size) {
		this.size = size;
		System.out.println("Setting size");
	}
	
	public int getSize() {
		return size;
	}
	
	public int getCurrentCount() {
		return currentCount;
	}
	
	public void sampleMethod(int a, double b) {
		System.out.println("Method 1");
	}
	
	public void sampleMethod(double b, int a) {
		System.out.println("Method 2");
	}
	
	public String doMethod(char a, char b, char c) {
		String s = null;
		return s;
	}
	
	void addHalf(FloatNumber value) {
		value.setNumber(value.getNumber() + (value.getNumber()/2f));
	}
	
	public void sampleMethod1(int i) {
		i++;
	}
	
//	public static void sampleMethodOne() {
//		sampleMethodTwo(); cannot call a non-static method
//	}
//	
//	public void sampleMethodTwo() {
//		System.out.println("sampleMethodTwo");
//	}
	
}
