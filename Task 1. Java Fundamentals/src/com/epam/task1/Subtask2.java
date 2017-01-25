package com.epam.task1;

public class Subtask2 { // format of command line parameters: a b c (a, b, c - real numbers)
	public static void main(String[] args) {
		if (args.length == 3) {
			double a = 0.0;
			double b = 0.0;
			double c = 0.0;

			try {
				a = Double.valueOf(args[0]);
				b = Double.valueOf(args[1]);
				c = Double.valueOf(args[2]);
			} catch (NumberFormatException e1) {

				System.out.println("Wrong input format! Please, input command line parameters in format: a b c (a, b, c - real numbers).");
				System.exit(0);
			}
			System.out.println("You are input: a = " + a + ", b = " + b + ", c = " + c);

			double result = 0.0;

			if ((a == 0) || (b == 0)) {
				System.out.println("Result will not defined");
			} else {
				result = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
				System.out.println("Result = " + result);
			}
		} else {
			System.out.println("Ñommand line parameters are not entered or entered incorrectly. Please, input command line parameters in format: a b c (a, b, c - real numbers).");
		}
	}
}
