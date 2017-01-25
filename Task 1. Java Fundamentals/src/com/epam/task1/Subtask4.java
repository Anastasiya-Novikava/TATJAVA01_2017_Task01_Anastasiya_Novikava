package com.epam.task1;

public class Subtask4 { // format of command line parameters: x y (x, y - coordinates)
	public static void main(String[] args) {
		if (args.length == 2) {
			double x = 0.0;
			double y = 0.0;
			try{
			x = Double.valueOf(args[0]);
			y = Double.valueOf(args[1]);
			} catch (NumberFormatException e1) {

				System.out.println("Wrong input format! Please, input command line parameters in format: x y (x, y - coordinates).");
				System.exit(0);
			}
			System.out.println("You are input: x = " + x + ", y = " + y);
			
			if((((x >= -4) && (x <= 4)) && ((y >= -3) && (y <= 0))) || (((x >= -2) && (x <= 2)) && ((y > 0) && (y <= 4)))){
				System.out.println(true);
			}
			else System.out.println(false);
		} else {
			System.out.println("Ñommand line parameters are not entered or entered incorrectly. Please, input command line parameters in format: x y (x, y - coordinates).");
		}
	}
}
