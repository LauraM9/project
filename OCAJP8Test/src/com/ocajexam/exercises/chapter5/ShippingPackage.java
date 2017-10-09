package com.ocajexam.exercises.chapter5;

public class ShippingPackage {
	
	public static int nextTrackingNumber = 100000;
	private int packageTrackingNumber;
	
	public ShippingPackage() {
		this.packageTrackingNumber = nextTrackingNumber;
		nextTrackingNumber++;
	}
	
	public int getPackageTrackingNumber() {
		return packageTrackingNumber;
	}
	
}
