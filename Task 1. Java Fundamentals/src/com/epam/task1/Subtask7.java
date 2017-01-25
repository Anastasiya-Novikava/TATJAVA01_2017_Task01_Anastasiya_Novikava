package com.epam.task1;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Subtask7 { // format of command line parameters: a b h (a, b -
						// boundaries of segment, h - step)
	public static void main(String[] args) {
		if (args.length == 3) {
			BigDecimal a = new BigDecimal("0");
			BigDecimal b = new BigDecimal("0");
			BigDecimal h = new BigDecimal("0");

			try {
				a = new BigDecimal(args[0]);
				b = new BigDecimal(args[1]);
				h = new BigDecimal(args[2]);
			} catch (NumberFormatException e1) {

				System.out.println(
						"Wrong input format! Please, input command line parameters in format: a b c (a, b, c - numbers).");
				System.exit(0);
			}

			System.out.println("You are input: a = " + a + ", b = " + b + ", h = " + h);

			ArrayList<BigDecimal> arguments = new ArrayList<BigDecimal>();
			ArrayList<BigDecimal> values = new ArrayList<BigDecimal>();

			for (BigDecimal i = a; (i.compareTo(b) == -1) || (i.compareTo(b) == 0); i = i.add(h)) {
				arguments.add(i);
			}

			for (BigDecimal argument : arguments) {
				values.add(sin(argument).pow(2).subtract(cos(argument.multiply(new BigDecimal("2")))));
			}

			for (int i = 0; i < arguments.size(); ++i) {
				System.out.println(arguments.get(i) + "\t" + values.get(i));
			}
		} else {
			System.out.println(
					"Ñommand line parameters are not entered or entered incorrectly. Please, input command line parameters in format: a b h (a, b - boundaries of segment, h - step).");
		}
	}

	public static BigDecimal sin(BigDecimal bd) {
		double d = bd.doubleValue();
		BigDecimal ret = new BigDecimal(Math.sin(d));
		return ret;
	}

	public static BigDecimal cos(BigDecimal bd) {
		double d = bd.doubleValue();
		BigDecimal ret = new BigDecimal(Math.cos(d));
		return ret;
	}
}