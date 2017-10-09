package com.ocajexam.exercises.chapter11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ArraysSort {

	public static void main(String[] args) {
		Dog d1 = new Dog("Max", 2, 50);
		Dog d2 = new Dog("Rocky", 1, 30);
		Dog d3 = new Dog("Bear", 3, 40);
		Dog[] dogArray = {d1, d2, d3};
//		printDogs(dogArray);
		
//		Arrays.sort(dogArray, new Comparator<Dog>() {
//			@Override
//			public int compare(Dog o1, Dog o2) {
//				return o1.getWeight() - o2.getWeight();
//			}
//		});
		
//		Arrays.sort(dogArray, (m, n) -> m.getWeight() - n.getWeight());
//		(Dog m, Dog n) -> Integer.compare(m.getWeight(), n.getWeight()); //compile error
//		printDogs(dogArray);
		
//		Stream<Dog> dogStream = Stream.of(dogArray);
//		Stream<Dog> sortedDogStream = dogStream.sorted((Dog m, Dog n) -> Integer.compare(m.getWeight(), n.getWeight()));
//		sortedDogStream.forEach(d -> System.out.println(d));
		
		Predicate<Integer> isOdd = n -> n % 2 != 0;
		Callable<String> callMe = () -> "Hello";
	}

	public static void printDogs(Dog[] dogs) {
		System.out.println("-- Dog List --");
		for (Dog d : dogs) {
			System.out.println(d);
		}
	}
}
