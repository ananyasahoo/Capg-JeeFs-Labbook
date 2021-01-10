package com.cg.IntegerSum.util;
import org.junit.Test;

import static org.junit.Assert.*;



public class IntegerSumTest {
	IntegerSum integerSum=new IntegerSum();

	@Test

	public void test_sumOfInteger_GivenInput0_ShouldReturn0AsInteger() {
		String input="";
		int result=integerSum.sumOfInteger(input);
		assertEquals(0,result);
	}
	@Test
	public void test_sumOfInteger_GivenSingleDigitInput_ShouldReturnSameDigitAsInteger() {
		String input="1";
		int result=integerSum.sumOfInteger(input);
		assertEquals(1,result);
	}
	@Test
	public void test_sumOfInteger_GivenMoreThan1DigitInput_ShouldReturnSumAsInteger() {
		String input="1 3 8 7 5";
		int result=integerSum.sumOfInteger(input);
		assertEquals(24,result);

	}

}
