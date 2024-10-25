package com.testDemo.TestDemoTDD;

import java.util.ArrayList;
import java.util.List;

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

		//arraylist to store negative numbers
		List<Integer> negatives= new ArrayList<>();
		
		// to add numbers into sum
		String arrayOfNumbers[] = numbers.split(delimiter);
		int sum = 0;
		for (String str : arrayOfNumbers) {
			int num=Integer.parseInt(str.trim());
			if(num>0) {
				sum +=num;
			}
//			else {
//				negatives.add(num);
//			}
//
//		}
//		if(!negatives.isEmpty()) {
//			throw new IllegalArgumentException("Negative numbers not allowed: " + negatives);
//		}
	//	return sum;
	}return sum;
}}
