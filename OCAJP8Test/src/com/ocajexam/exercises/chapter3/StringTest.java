package com.ocajexam.exercises.chapter3;

public class StringTest {
	
	private String val;
	
	public StringTest(String val) {
		this.val = val;
	}

	private final char value[] = null; // the value is used for character
										// storage
	private final int offset = 0; // the offset is the first index of the
									// storage that is used
	
	@Override
	/**
	 * this is not working
	 */
	public boolean equals(Object anObject) {
		System.out.println("entered overriden equals method");
		if (this == anObject) {
			System.out.println("This is an object");
			return true;
		}
		if (anObject instanceof String) {
			System.out.println(anObject + " is instance of String");
			String anotherString = (String) anObject;
			int n = this.val.length();
			System.out.println("n = " + n);
			if (n == anotherString.length()) {
				System.out.println("Strings have the same length");
				char v1[] = value;
				char v2[] = this.value;
				int i = offset;
				int j = this.offset;
				while (n-- != 0) {
					if (v1[i++] != v2[j++]) {
						return false;
					}
					return true;
				}
			}
				return false;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		String s1 = "String one";
		String s2 = "String two";
		String s3 = "String " + "three";

		// System.out.println("foo" == "foo");
		// System.out.println(new String("bar") == new String("bar"));

		String pirateMessage = "  Buried Treasure Chest! ";

		char c1 = pirateMessage.charAt(0);
		char c2 = pirateMessage.charAt(2);
		char c3 = pirateMessage.charAt(23);

		// System.out.println("c1 = " + c1 + ", c2 = " + c2 + ", c3 = " + c3);

		int i1 = pirateMessage.indexOf('u');
		// System.out.println("i1 = " + i1);
		int i2 = pirateMessage.indexOf('u', 9);
		// System.out.println("i2 = " + i2);
		int i3 = pirateMessage.indexOf("sure");
		// System.out.println("i3 = " + i3);
		int i4 = pirateMessage.indexOf("Treasure", 10);
		// System.out.println("i4 = " + i4);
		int i5 = pirateMessage.indexOf("u", 100);
		// System.out.println("i5 = " + i5);

		int i = pirateMessage.length();
		// System.out.println("i = " + i);
		String[] stringArray = new String[3];
		int value = stringArray.length;
		// System.out.println("value = " + value);

		String ss1 = pirateMessage.replace('B', 'J');
		// System.out.println("ss1 = " + ss1);
		String ss2 = pirateMessage.replace(' ', 'X');
		// System.out.println("ss2 = " + ss2);
		String ss3 = pirateMessage.replace("Chest", "Coins");
		// System.out.println("ss3 = " + ss3);

		boolean b3 = pirateMessage.startsWith("Treasure", 9);
		// System.out.println("b3 = " + b3);

		boolean e1 = pirateMessage.endsWith("Treasure Chest! ");
		// System.out.println("e1 = " + e1);

		String a1 = pirateMessage.substring(9);
		// System.out.println("a1 = " + a1);
		String a2 = pirateMessage.substring(9, 10);
		// System.out.println("a2 = " + a2);
		String a3 = pirateMessage.substring(9, 23);
		// System.out.println("a3 = " + a3);
		// String a4 = pirateMessage.substring(9, 8);
		// System.out.println("a4 = " + a4);
		String a5 = pirateMessage.substring(8, 8);
		// System.out.println("a5 = " + a5);

		String t = pirateMessage.trim();
		// System.out.println("t = " + t);
		String l1 = pirateMessage.toLowerCase();
		// System.out.println("l1 = " + l1);
		String u1 = pirateMessage.toUpperCase();
		// System.out.println("u1 = " + u1);

		String msg = "  Maroon the First Mate with a flagon of water and a pistol!   ";
		msg = msg.trim().replace("First Mate", "Quartermaster").substring(0, 47) + ".";
		// System.out.println("msg = " + msg);

		StringBuilder mateyMessage;
		// mateyMessage = new StringBuilder("Shivers!");
		// System.out.println(mateyMessage.append(" Bad Storm!"));

		StringBuilder e = new StringBuilder("Examples:");
		e.append(" ").append("1");
		e.append(" ").append(new StringBuffer("2"));
		e.append(" ").append('\u0031');
		e.append(" ").append((int) 2);
		e.append(" ").append(1L);
		e.append(" ").append(2F);
		e.append(" ").append(1D);
		e.append(" ").append(true);
		// System.out.println(e);

		mateyMessage = new StringBuilder("Shiver Me Timbers!");
		// System.out.println(mateyMessage.insert(17, " and Bricks"));

		// System.out.println(mateyMessage.delete(6, 16));

		// System.out.println(mateyMessage.deleteCharAt(17));

		StringBuilder r = new StringBuilder("part");
		r.reverse();
		// System.out.println("It's a " + r + "!");

		StringBuilder aux = new StringBuilder("Maroon the First Mate with a flagon of water and a pistol!");
		// System.out.println("aux lenght is " + aux.length());

		StringBuilder sb = new StringBuilder(); // constructs a string builder
												// with no characters in it and
												// an initial capacity of 16
												// characters
		sb.capacity();
		// System.out.println("sb capacity is " + sb.capacity());
		sb.append("Maroon the First Mate with a flagon of water and a pistol!");

		StringBuilder sb1 = new StringBuilder('a'); // constructs a string
													// builder that contains the
													// same characters as the
													// specified CharSequence
		// System.out.println("chars in sb1: " + sb1.chars().count());

		StringBuilder sb2 = new StringBuilder(1); // constructs a string builder
													// with no characters in it
													// and an initial capacity
													// specified by the capacity
													// argument
		// System.out.println("sb2 capacity is " + sb2.capacity());

		StringBuilder sb3 = new StringBuilder("laura"); // constructs a string
														// builder initialized
														// to the contents of
														// the specified string
		// System.out.println("sb2 reverse is " + sb3.reverse());
		
		StringTest st = new StringTest("This is a test");
		
//		System.out.println(st.equals("This is a test"));
		
//		Comparing references
		String cmd = "Set Sail!";
		String command = cmd;
//		System.out.println(cmd == command);
		
		String interjection1 = "Arrgh!";
		String interjection2 = "Arrgh!";
		String interjection3 = new String("Arrgh!");
//		System.out.println(interjection1 == interjection3);
		
//		System.out.println(interjection1 == null ? interjection2 == null : interjection1.equals(interjection2));
		
		String eggs1 = "Cackle fruits!";
		String eggs2 = "Cackle fruit";
//		System.out.println(eggs1.compareTo(eggs2));

		
	}

}
