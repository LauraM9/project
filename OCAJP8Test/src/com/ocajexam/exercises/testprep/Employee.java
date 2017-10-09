package com.ocajexam.exercises.testprep;

public class Employee {
	private String empName;
	private int empNum;
	private String empDept;
	
	public Employee() {
		this("", 55, "");
	}
	
	public Employee(String name, int num, String dept) {
//		this();
		empName = name;
		empNum = num;
		empDept = dept;
	}
}
