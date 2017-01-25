package com.epam.task1;

import java.math.BigDecimal;

public class Subtask6 { // format of command line parameters: a b c (a, b, c - numbers)
	public static void main(String[] args) {
		if (args.length == 3) {
			BigDecimal[] input = new BigDecimal[3];

			try {
				for (short i = 0; i < 3; ++i) {
					input[i] = new BigDecimal(args[i]);
				}
			} catch (NumberFormatException e1) {

				System.out.println("Wrong input format! Please, input command line parameters in format: a b c (a, b, c - numbers).");
				System.exit(0);
			}
			
			System.out.println("You are input: a = " + input[0] + ", b = " + input[1] + ", c = " + input[2]);

			BigDecimal min = input[0];
			BigDecimal max = input[0];
			for (short i = 0; i < 3; ++i) {
				if (min.compareTo(input[i]) == 1) {
					min = input[i];
				}
				if (max.compareTo(input[i]) == -1) {
					max = input[i];
				}
			}

			BigDecimal sum = new BigDecimal("0");
			sum = min.add(max);
			System.out.println("Sum = " + sum);

		} else {
			System.out.println("Ñommand line parameters are not entered or entered incorrectly. Please, input command line parameters in format: a b c (a, b, c - numbers).");
		}
	}
}