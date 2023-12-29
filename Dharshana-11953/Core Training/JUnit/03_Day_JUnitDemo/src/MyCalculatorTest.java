package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalculatorTest {

	@Test
	public void test_add1() 
	{
		MyCalculator mc = new MyCalculator();
		int result = mc.add(10, 5);
		assertEquals(15, result);
	}
	
	@Test
	public void test_add2() 
	{
		MyCalculator mc = new MyCalculator();
		assertEquals(-5, mc.add(-10, 5));
	}

	@Test
	public void test_multi1() 
	{
		MyCalculator mc = new MyCalculator();
		assertEquals(15, mc.multi(3, 5));
	}
	
	@Test
	public void test_multi2() 
	{
		MyCalculator mc = new MyCalculator();
		assertEquals(5, mc.multi(1, 5));
	}
	
	@Test
	public void test_divide1() 
	{
		MyCalculator mc = new MyCalculator();
		try {
			int result = mc.divide(4, 0);
			assertEquals(2, result);
		}
		catch(Exception e) {
			fail("Invalid Division");
		}
		
	}
}

