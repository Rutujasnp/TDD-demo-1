package com.testDemo.TestDemoTDD;

public class CalculatorService {

	public static int addNums(String numbers) {

		if (numbers=="null"|| numbers.isEmpty()) {		//for if the string numbers is empty
			return 0;
			
		}
		numbers= numbers.replace("\n", ",");
String delimiter=",";
		String arrayOfNumbers[]= numbers.split(delimiter);
		int sum=0;
		for (String str: arrayOfNumbers) {
			sum+=Integer.parseInt(str.trim());
			
		}
		return sum;
	}
}
