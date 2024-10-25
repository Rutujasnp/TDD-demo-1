package com.testDemo.TestDemoTDD;

public class CalculatorService {

	public static int addNums(String numbers) {

		if (numbers == "null" || numbers.isEmpty()) { // for if the string numbers is empty
			return 0;

		}
		// if the string contains custom delimiter
		String delimiter = ",|\n";
		int delimiterIndex = numbers.indexOf("\n");
		if (numbers.startsWith("//")) {
			delimiter = numbers.substring(2, delimiterIndex);
			// Handle multiple character delimiters surrounded by []
			if (delimiter.startsWith("[") && delimiter.endsWith("]")) {
				delimiter = delimiter.substring(1, delimiter.length() - 1); // Remove the brackets
			}
			numbers = numbers.substring(delimiterIndex + 1);
		}

		// numbers= numbers.replace("\n", ",");

		// to add numbers into sum
		String arrayOfNumbers[] = numbers.split(delimiter);
		int sum = 0;
		for (String str : arrayOfNumbers) {
			sum += Integer.parseInt(str.trim());

		}
		return sum;
	}
}
