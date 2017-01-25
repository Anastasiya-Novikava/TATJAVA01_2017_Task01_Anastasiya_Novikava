package com.epam.task1;

import java.math.BigDecimal;

public class Subtask5 { // format of command line parameters: a b c (a, b, c - real numbers)
	public static void main(String[] args) {
		if (args.length == 3) {
			BigDecimal[] input = new BigDecimal[3];
			BigDecimal[] result = new BigDecimal[3];

			try {
				for (short i = 0; i < 3; ++i) {
					input[i] = new BigDecimal(args[i]);
					if (((input[i].compareTo(new BigDecimal("0"))) == 1) || ((input[i].compareTo(new BigDecimal("0"))) == 0)){
						result[i] = input[i].pow(2);
					} else {
						result[i] = input[i].pow(4);
					}
				}
			} catch (NumberFormatException e1) {

				System.out.println("Wrong input format! Please, input command line parameters in format: a b c (a, b, c - real numbers).");
				System.exit(0);
			}

			System.out.println("You are input: a = " + input[0] + ", b = " + input[1] + ", c = " + input[2]);

			for (short i = 0; i < 3; ++i) {
				System.out.println("Result_" + i + " = " + result[i]);
			}

		} else {
			System.out.println("Ñommand line parameters are not entered or entered incorrectly. Please, input command line parameters in format: a b c (a, b, c - real numbers).");
		}
	}
}