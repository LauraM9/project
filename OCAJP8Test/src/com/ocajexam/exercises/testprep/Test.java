package com.ocajexam.exercises.testprep;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {
	public static void main(String[] args) {
		processData(generateList(), s -> s > 2);
	}
	
	public static void processData(List<Integer> data, Predicate<Integer> tester) {
		for (int s : data) {
			if (tester.test(s)) {
				System.out.println(s);
			}
		}
	}
	
	public static List<Integer> generateList() {
		List<Integer> data = new ArrayList<>();
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(4);
		return data;
	}
}
