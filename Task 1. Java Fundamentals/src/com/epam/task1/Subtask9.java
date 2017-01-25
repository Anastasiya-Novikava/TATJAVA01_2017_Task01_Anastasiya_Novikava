package com.epam.task1;

public class Subtask9 { // format of command line parameters: k (k - natural number)
	public static void main(String[] args) {
		byte Min = 0;
		byte Max = Byte.MAX_VALUE;

		byte dimensionFirstArrray = (byte) ((Math.random()*(Max + Min)) - Min);
		byte dimensionSecondArray = 0;
		while(dimensionFirstArrray != dimensionSecondArray){
			dimensionSecondArray = (byte) ((Math.random()*(Max + Min)) - Min);
		}

		if (args.length == 1) {
			byte k = 0;
			try{
			k = Byte.parseByte(args[0]);
			} catch (NumberFormatException e1) {

				System.out.println("Wrong input format! Please, input command line parameters in format: k (k - natural number).");
				System.exit(0);
			}
			
			if ((k > 0) && (k < dimensionFirstArrray)) {
				System.out.println("You are input: k = " + k);
				
				byte[] firstArray = new byte[dimensionFirstArrray];
				byte[] secondArray = new byte[dimensionSecondArray];

				System.out.println("First array: ");
				for (byte i = 0; i < dimensionFirstArrray; ++i) {
					firstArray[i] = (byte) ((Math.random()*(Max + Min)) - Min);
					System.out.print(firstArray[i] + " ");
				}

				System.out.println("\n" + "Second array: ");
				for (byte i = 0; i < dimensionSecondArray; ++i) {
					secondArray[i] = (byte) ((Math.random()*(Max + Min)) - Min);
					System.out.print(secondArray[i] + " ");
				}

				byte[] resultArray = new byte[dimensionFirstArrray + dimensionSecondArray];

				for (byte j = 0; j < k; ++j) {
					resultArray[j] = firstArray[j];
				}
				for (byte j = 0; j < dimensionSecondArray; ++j) {
					resultArray[j + k] = secondArray[j];
				}
				for (byte j = k; j < dimensionFirstArrray; ++j) {
					resultArray[j + dimensionSecondArray] = firstArray[j];
				}

				System.out.println("\n" + "Result array: ");
				for (short i = 0; i < dimensionFirstArrray + dimensionSecondArray; ++i) {
					System.out.print(resultArray[i] + " ");
				}
				
			} else {
				System.out.println("Please, input natural number less than " + dimensionFirstArrray);
			}

		} else {
			System.out.println("Ñommand line parameters are not entered or entered incorrectly. Please, input command line parameters in format: k (k - natural number).");
		}
	}
}
