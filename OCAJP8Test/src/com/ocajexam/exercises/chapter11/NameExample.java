package com.ocajexam.exercises.chapter11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NameExample {
	public static void main(String[] args) {
//		Names nameInstance = new Names() {
//			@Override
//			public void sayName(String name) {
//				System.out.println("My name is " + name);
//				
//			}
//		};
//		myName(nameInstance, "Laura");
		
//		myName(n -> System.out.println("My name is " + n), "Laura");
		
		String[] players = {"Rafael Nadal", "Novac Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer", "Andy Murray", "Tomas Berdych", "Juan Martin Del Potro"};
//		List<String> players = Arrays.asList(atp);
//		players.forEach(player -> System.out.print(player + "; "));
//		players.forEach(System.out::println);
		
//		Arrays.sort(players, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//		});
//		System.out.println("Players: " + Arrays.asList(players));
		
	}
	private static void myName(Names nameInstance, String name) {
		nameInstance.sayName(name);
	}
}
