package com.ocajexam.exercises.chapter3;

public class Strings {

	public static void main(String[] args) {
		
		String quote = "Dead Men Tell No Tales";
		quote.replace("No Tales", "Tales");
//		System.out.println(quote);
		
		float reale = .007812f;
		float escudo = .125f;
		
//		System.out.println(reale + escudo + "% of one gold doubloon");
//		System.out.println((reale + escudo) + "% of one gold doubloon");
//		System.out.println("% of one gold doubloon" + (reale + escudo));
//		System.out.println("% of one gold doubloon" + reale + escudo);
		
		String title1 = " shovels.";
		String title2 = "Shovels";
		int flatShovels = 5;
		int roundPointShovels = 6;
		
//		System.out.println(flatShovels + roundPointShovels + title1);
//		System.out.println((flatShovels + roundPointShovels) + title1);
//		System.out.println(title2 + flatShovels + roundPointShovels);
//		System.out.println(title2 + (flatShovels + roundPointShovels));
		
//		System.out.print(3 + 3 + "3");
//		System.out.print(" and ");
//		System.out.print("3" + 3 + 3);
		
		String tenCharString = "AAAAAAAAAA";
		System.out.println(tenCharString.replace("AAA", "LLL"));
		
		System.out.println(tenCharString.indexOf(1));
		System.out.println(tenCharString.indexOf(1, 2));
		
		StringBuilder sb = new StringBuilder();
		sb.reverse();
		
//		String name1 = new String("Benjamin");
//		StringBuilder name2 = new StringBuilder("Benjamin");
		String name1 = "Benjamin";
		StringBuilder name2 = new StringBuilder();
		name2.append("Benjamin");
		
		System.out.println(name2.toString().equals(name1));
		
	}

}
