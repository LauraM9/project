package com.ocajexam.exercises.quiz;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;

import static java.lang.Math.abs;

public class Test2 {

	private static Pattern PATTERN = Pattern.compile("", Pattern.CASE_INSENSITIVE);

	public static void main(String[] args) {
		Instant i = Instant.now();
		long l1 = i.toEpochMilli();
		// System.out.println("l1 = " + l1);
		// try {
		// Thread.sleep(3000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		// long l2 = i.toEpochMilli();
		// System.out.println("l2 = " + l2);
		// System.out.println(l1 == l2 ? "SAME" : "DIFFERENT");

		ClassX sampleA = new ClassX();
		ClassX sampleB = new ClassZ();
		System.out.println("A: " + sampleA.currentStatus() + " B: " + sampleB.currentStatus());

		String s1 = new String("FIVE DOLLARS");
		String s2 = new String("five dollars");
		s2.toUpperCase();
		System.out.println(s1.equals(s2));

		List<String> bookList = new ArrayList<>();
		bookList.add("Java Pocket Guide");
		bookList.add("Neteans Study Guide");
		for (String book : bookList) {
			System.out.println("Title: " + book);
		}
		System.out.println();
		// bookList.forEach(p -> {System.out.println("Title: " + p);});

		LocalDateTime ldt = LocalDateTime.parse("2015-01-01T01:01:01");
		ldt.plusYears(1).plusMonths(1).plusDays(1).minusYears(1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
		System.out.println(ldt.format(formatter));

		int x = 0;
		do {
			x = x + 2;
			System.out.println("x: " + x);
		} while (--x < 5);

		System.out.println();
		int value = 1;
		switch (value) {
		case 0:
			System.out.println("Dog");
		case 1:
			System.out.println("Cat");
		case 2:
			System.out.println("Fish");
		default:
			System.out.println("Cow");
		}

		System.out.println();
		for (int xx = 0; xx < 10; xx++) {
			if (xx % 2 == 0) {
				System.out.println("xx: " + xx + " - Even");
				continue;
			} else {
				System.out.println("xx: " + xx + " - Odd");
			}
			xx++;
		}
		int sampleArrayG[][][] = new int[3][][];

		System.out.println();
		int[][] sampleArray = new int[3][4];
		for (int ii = 0; ii < 3; ii++) {
			sampleArray[ii][ii + 1] = 2;
		}
		for (int ii = 0; ii < 3; ii++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(sampleArray[ii][j] + " ");
			}
			System.out.println();
		}
		int sum = 0;
		for (int ii = 0; ii < 3; ii++) {
			for (int j = 0; j < 3; j++) {
				sum += sampleArray[ii][j];
			}
		}
		System.out.println("sum =  " + sum);

		System.out.println();
		ArrayList<String> a = new ArrayList<>();
		a.add("Shelby");
		a.add("Peter");
		a.add("Undefined");
		a.add("Benjamin");
		a.add(2, "Happy");
		for (String s : a) {
			System.out.println(s + " ");
		}

		System.out.println();
		String s = "roberto".replaceAll("o", "!").substring(2, 6);
		System.out.println(s);

		System.out.println();
		List<String> surnameList = new ArrayList<>();
		surnameList.add("McCullough");
		surnameList.add("McDonald");
		surnameList.add("McIntosh");
		surnameList.removeIf((p) -> {
			return (p.equals("McCullough"));
		});
		surnameList.forEach(p -> {
			System.out.println(p);
		});

		System.out.println();
		// ClassY sample = new ClassX(); // nope

		float fvar = 3.3f;
		// int ivar = fvar;
		double dvar = fvar;
		short svar = (short) fvar;
		int ivar = (short) fvar;

		ClassX sampleAA = new ClassX();
		ClassX sampleBB = new ClassY();
		System.out.println("A: " + sampleAA.currentStatus() + " B: " + sampleBB.currentStatus());

		int jj = 0;
		char cc = (char) jj;
		long ll = jj;

		List<String> list1 = new ArrayList<>();
		list1.add("roses");
		list1.add("daisies");

		Stack<String> list2 = new Stack<>();
		list2.add("carnations");
		list2.add("tulips");

		int absoluteValue = abs(-21);

		System.out.println();
		int j = 0;
		for (j = 1; j < 10;) {
			j++;
			++j;
		}
		System.out.println(j);

		System.out.println();
		String baby = "squirrel";
		switch (baby) {
		case "squirrel":
//			System.out.println("Baby Squirrel");
		case "rabbit":
			System.out.println("Baby Rabbit");
			break;
		case "turtle":
			System.out.println("Baby Turtle");
//			break;
		default:
			System.out.println("Baby!");
			break;
		}

		ArrayList d1 = new ArrayList();
		int num=1;
		print(num);
	}

	public void simpleTest() {
		int i = 0;
		System.out.println(i);
	}

	public void testLoops() {
		int counter = 0;
		do {
			for (int i = 0; i < 100; i++) {
				counter++;
			}
			break;
			// System.out.println("Counter: " + counter); // unreachable
		} while (true);
	}

	public static void print(int num) {
		try {
			System.out.println(num);
			num++;
			int i = 1 / (num - 101);
			System.out.println(i);
			print(num);
		} catch (Exception e) {
		}

	}
}
