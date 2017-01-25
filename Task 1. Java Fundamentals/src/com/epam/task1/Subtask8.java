package com.epam.task1;

public class Subtask8 { // format of command line parameters: N K (N - dimension of array, K - predetermined number)
	public static void main(String[] args) {
		if (args.length == 2) {

			int n = 0;
			double k = 0;
			int[] a = null;

			try {
				n = Integer.valueOf(args[0]);
				if (n >= 0) {
					k = Double.valueOf(args[1]);
					a = new int[n];
				} else {
					System.out.println("Dimension of array can't be negative");
					System.exit(0);
				}
			} catch (NumberFormatException e1) {

				System.out.println("Wrong input format! Please, input command line parameters in format: N K (N - dimension of array, K - predetermined number).");
				System.exit(0);
			}
			System.out.println("You are input: N = " + n + ", K = " + k);

			int min = 0;
			int max = Integer.MAX_VALUE;
			long sum = 0;

			for (int i = 0; i < n; ++i) {
				a[i] = (int) (Math.random() * (max + min)) - min;
				if ((a[i] % k) == 0) {
					sum += a[i];
				}
			}

			System.out.println("Result: " + sum);
		} else {
			System.out.println("Ñommand line parameters are not entered or entered incorrectly. Please, input command line parameters in format:N K (N - dimension of array, K - predetermined number).");
		}
	}
}