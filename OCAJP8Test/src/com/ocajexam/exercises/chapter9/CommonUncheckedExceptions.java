package com.ocajexam.exercises.chapter9;

import java.awt.print.PageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CommonUncheckedExceptions {
	
	public void forceIllegalArgumentException() {
		PageFormat path = new PageFormat();
		path.setOrientation(3);
	}
	
	public void forceNumberFormatException() {
		Double.parseDouble("2.1");
		Double.parseDouble("INVALID");
	}
	
	public void forceArrayIndexOutOfBoundsException() {
		Float[][] num = new Float[3][3];
		num[2][0] = (float)1.2;
		num[2][1] = (float)2.0;
		System.out.println(num[2][2]);
		System.out.println(num[3][3]);
	}
	
	public void forceIndexOutOfBoundsException() {
		List<String> gorillaSpecies = new LinkedList<>();
		gorillaSpecies.add("Eastern");
		gorillaSpecies.add("Western");
		System.out.println(gorillaSpecies.get(1));
		System.out.println(gorillaSpecies.get(2));
	}
	
	public void forceNullPointerException() {
		String iceCreamFlavor = "vanilla";
		iceCreamFlavor = null;
		System.out.println(iceCreamFlavor.length());
	}
	
	public void forceIllegalStateException() {
		List<String> chord = new ArrayList<>();
		chord.add("D");
		chord.add("G");
		chord.add("B");
		chord.add("G");
		Iterator it = chord.iterator();
		while (it.hasNext()) {
			it.next();
			it.remove();
			it.remove(); // remove depends on next
		}
	}
	
	public void forceClassCastException() {
		Object x = new Float("1.0");
		System.out.println((Double) x);
		System.out.println((String) x);
	}
	
	public void forceArithmeticException() {
		int apple;
		apple = (4 / 2);
		apple = (4 / 0);
	}
	
	public static void main(String[] args) {
		CommonUncheckedExceptions cue = new CommonUncheckedExceptions();
//		cue.forceIllegalArgumentException();
//		cue.forceNumberFormatException();
//		cue.forceArrayIndexOutOfBoundsException();
//		cue.forceIndexOutOfBoundsException();
//		cue.forceNullPointerException();
//		cue.forceIllegalStateException();
		cue.forceClassCastException();
//		cue.forceArithmeticException();
	}

}
