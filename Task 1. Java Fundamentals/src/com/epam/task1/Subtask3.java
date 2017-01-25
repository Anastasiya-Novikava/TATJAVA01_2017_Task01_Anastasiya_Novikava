package com.epam.task1;

public class Subtask3 { // format of command line parameters: a b (a, b - legs of a right triangle)
	public static void main(String[] args) {
		if (args.length == 2) {
			double a = 0.0;
			double b = 0.0;
			try{
			a = Double.valueOf(args[0]);
			b = Double.valueOf(args[1]);
			} catch (NumberFormatException e1) {

				System.out.println("Wrong input format! Please, input command line parameters in format: a b (a, b - legs of a right triangle).");
				System.exit(0);
			}
			System.out.println("You are input: a = " + a + ", b = " + b);
			
			if ((a < 0) || (b < 0)) {
				System.out.println("Cathetus can't be negative.");
			}
			if ((a == 0) || (b == 0)) {
				System.out.println("The right triangle degenerates to a line.");
			} else {
				double square = 0.0;
				double perimeter = 0.0;
				
				double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
				square = a * b / 2;
				perimeter = a + b + c;
				
				System.out.println("Square = " + square);
				System.out.println("Perimeter = " + perimeter);
			}
		}
		else {
			System.out.println("Ñommand line parameters are not entered or entered incorrectly. Please, input command line parameters in format: a b (a, b - legs of a right triangle).");
		}
	}
}
