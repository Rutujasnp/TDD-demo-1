package com.testDemo.TestDemoTDD;

public class CalculatorService {

	public static int addNums(String numbers) {

		if (numbers=="null"|| numbers.isEmpty()) {		//for if the string numbers is empty
			return 0;
			
		}
		
		numbers= numbers.replace("\n", ",");
		
		//to add numbers into sum
		String arrayOfNumbers[]= numbers.split(",");
		int sum=0;
		for (String str: arrayOfNumbers) {
			sum+=Integer.parseInt(str.trim());
			
		}
		return sum;
	}
}
