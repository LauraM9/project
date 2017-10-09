/**
 * This file is intended as an example for the chapter "Compiling Your Source Code"
 */
package com.ocajexam.exercises.chapter1;

import com.ocajexam.exercises.chapter1.planets.Earth;
import com.ocajexam.exercises.chapter1.planets.Mars;
import com.ocajexam.exercises.chapter1.planets.Venus;

/**
 * Generic class for beginners in Java
 * @author laura.miclescu
 *
 */
public class GreetingsUniverse {

	/**
	 * This is the main method
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Greetings, Universe!");
		Earth e = new Earth();
		Mars m = new Mars();
		Venus v = new Venus();
	}

}
