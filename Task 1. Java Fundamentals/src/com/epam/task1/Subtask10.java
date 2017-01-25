package com.epam.task1;

public class Subtask10 { // format of command line parameters: n (n - even number)
	public static void main(String[] args) {
		if (args.length == 1) {
			int n = 0;
			try{
			n = Integer.valueOf(args[0]);
			} catch (NumberFormatException e1) {

				System.out.println("Wrong input format! Please, input command line parameters in format: n (n - even number).");
				System.exit(0);
			}

			if ((n % 2) == 0) {
				System.out.println("You are input: n = " + n + "\n");

				int[][] matrix = new int[n][n];

				for (int i = 0; i < n; ++i) {
					for (int j = 0; j < n; ++j) {
						if ((i % 2) == 0) {
							matrix[i][j] = j + 1;
						} else {
							matrix[i][j] = n - j;
						}
					}
				}
				
				for (int i = 0; i < n; ++i) {
					for (int j = 0; j < n; ++j) {
						System.out.print(matrix[i][j] + " ");
					}
					System.out.println();
				}

			} else {
				System.out.println("Please, input even number");
			}
		} else {
			System.out.println("Ñommand line parameters are not entered or entered incorrectly. Please, input command line parameters in format: n (n - even number).");
		}
	}
}
