package com.ocajexam.exercises.chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LambdaExpressionExample {

	public static void main(String[] args) {
//		int width = 10;
//		Drawable d = new Drawable() {
//			
//			@Override
//			public void draw() {
//				System.out.println("Drawing " + width);
//			}
//		};
//		d.draw();
//		
//		Drawable d2 = () -> {System.out.println("Drawing " + width);};
//		d2.draw();
//		
//		Sayable s = name -> {return "Hello, " + name;};
//		System.out.println(s.say("Laura"));
//		
//		Addable ad = (a, b) -> (a + b);
//		System.out.println(ad.add(100, 200));
//		
//		Addable ad2 = (a, b) -> {return (a + b);};
//		System.out.println(ad2.add(200, 200));
//		
//		List<String> list = new ArrayList<>();
//		list.add("ankit");
//		list.add("mayank");
//		list.add("irfan");
//		list.add("jai");
//		list.forEach((n) -> System.out.println(n));
//		
//		Sayable person = message -> {
//			String str1 = "I would like to say, ";
//			String str2 = str1 + message;
//			return str2;
//		};
//		System.out.println(person.say("time is precious."));
		
//		no lambda
//		Runnable r1 = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Thread1 is running...");
//			}
//		};
//		Thread t1 = new Thread(r1);
//		t1.start();
		
//		with lambda
//		Runnable r2 = () -> {System.out.println("Thread2 is running...");};
//		Thread t2 = new Thread(() -> {System.out.println("Thread2 is running...");});
//		t2.start();
		
		List<Product> listProduct = new ArrayList<>();
		listProduct.add(new Product(1, "Samsung A5", 17_000f));
		listProduct.add(new Product(3, "Iphone 6S", 65_000f));
		listProduct.add(new Product(2, "Sony Xperia", 25_000f));
		listProduct.add(new Product(4, "Nokia Lumia", 15_000f));
		listProduct.add(new Product(5, "Redmi4", 26_000f));
		listProduct.add(new Product(6, "Lenevo Vibe", 19_000f));
		
//		System.out.println("Sorting on the basis of name...");
//		Collections.sort(listProduct, (p1, p2) -> {
//			return p1.name.compareTo(p2.name);
//		});
//		for(Product p : listProduct) {
//			System.out.println(p.id + " " + p.name + " " + p.price);
//		}
		
		Stream<Product> filteredData = listProduct.stream().filter(p -> p.price > 20_000);
		filteredData.forEach(product -> System.out.println(product.name + ": " + product.price));
		
		JTextField tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		JButton b = new JButton("click");
		b.setBounds(80, 100, 70, 30);
		
		b.addActionListener(e -> {tf.setText("hello swing");});
		
		JFrame f = new JFrame();
		f.add(tf); f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
