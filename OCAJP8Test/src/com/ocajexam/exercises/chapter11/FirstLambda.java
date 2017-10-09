package com.ocajexam.exercises.chapter11;

public class FirstLambda {
	public static void main(String[] args) {
		LambdaFunction lambdaFunction = () -> System.out.println("Hello, world!");
		lambdaFunction.call();
	}
}
