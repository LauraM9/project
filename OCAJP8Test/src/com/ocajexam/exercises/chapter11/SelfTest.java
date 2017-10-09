package com.ocajexam.exercises.chapter11;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelfTest {

	public static void main(String[] args) {
		PathMatcher matcher1 = (Path p) -> {return (p.toString().contains("DNA"));};
		PathMatcher matcher2 = p -> {return (p.toString().equals("DNA"));};
		PathMatcher matcher3 = (Path p) -> p.toString().startsWith("DNA");
		PathMatcher matcher4 = p -> p.toString().endsWith("DNA");
		Path path = FileSystems.getDefault().getPath("\\dna_data\\DNA_results.txt");
//		System.out.print(matcher1.matches(path));
//		System.out.print(" " + matcher2.matches(path));
//		System.out.print(" " + matcher3.matches(path));
//		System.out.print(" " + matcher4.matches(path));
		
//		System.out.println();
		List<String> yHaplogroupList = new ArrayList<>();
		yHaplogroupList.add("I2");
		yHaplogroupList.add("L126");
		yHaplogroupList.add("R1b");
//		yHaplogroupList.stream().filter(s -> !s.startsWith("R")).forEach(s -> System.out.print(s + " "));
//		yHaplogroupList.forEach(s -> System.out.print(s + " "));
//		yHaplogroupList.removeIf(s -> s.startsWith("R"));
//		yHaplogroupList.forEach(s -> System.out.print(s + " "));
		
//		System.out.println();
		String[] birdArray = {"bluebird", "scarlet macaw", "bluejay"};
		List<String> birdList = Arrays.asList(birdArray);
		birdList.forEach((p -> {;;} ));
		
		System.out.println("usical".matches("musical"));
		int sa[][] = {{1,2},{3,4}};
		for (int i[] : sa) {
			for (int j : i) {
				
			}
		}
		
		System.out.println("A" + (1 + 1));
		System.out.println(LocalTime.NOON);
		
	}

}
