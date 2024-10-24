package com.testDemo.TestDemoTDD;

public class CalculatorService {

	public static int addNums(String numbers) {

		if (numbers.isEmpty()) {		//for if the string numbers is empty
			return 0;
		}
		int result = Integer.parseInt(numbers);		// for single number in string numbers
		return result;
		
	}
}
