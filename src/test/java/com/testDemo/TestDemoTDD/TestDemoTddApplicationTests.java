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
}
