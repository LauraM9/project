package com.ocajexam.exercises.quiz1;

public class CmdLineInput {

	public static void main(String[] args) {
		int i = 0;
		do {
			if (args.length == 0) {
				System.out.println("No input");
				break;
			}
			System.out.println(args[i] + " ");
			i++;
		} while (i < args.length);
		System.out.println("Finished");
	}

}
