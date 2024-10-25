package com.testDemo.TestDemoTDD;

import org.assertj.core.api.Assert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestDemoTddApplicationTests {
	@Test
	public void testEmptyString() {
		Assertions.assertEquals(0, CalculatorService.addNums(""));
		

}
	@Test
	public void testSingleNumbersreturnsSameNumber() {
		Assertions.assertEquals(1, CalculatorService.addNums("1"));
		
	}
	
	@Test
	public void testTwoNumbersReturnsSum() {
		Assertions.assertEquals(6, CalculatorService.addNums("1,5"));
	}
	
	@Test
	public void testMultipleNumbersReturnsSum() {
		Assertions.assertEquals(16, CalculatorService.addNums("1,3,5,7"));

	}
	
	@Test
	public void testNewlineDelimiter() {
		Assertions.assertEquals(6, CalculatorService.addNums("1\n2,3"));
	}
	
	@Test
	public void testCustomDelimiter() {
		Assertions.assertEquals(3, CalculatorService.addNums("//;\n1;2"));
	}
	
}
