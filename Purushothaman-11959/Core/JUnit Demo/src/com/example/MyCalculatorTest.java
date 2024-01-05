package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalculatorTest {

	@Test
	public void test_add1() 
	{
		MyCalculator mc=new MyCalculator();
		int result=mc.add(10, 5);
		assertEquals(15, result);
	}
	
	@Test
	public void test_add2() 
	{
		MyCalculator mc=new MyCalculator();
		assertEquals(-5, mc.add(-10, 5));
	}
	
	@Test
	public void test_mul1() 
	{
		MyCalculator mc=new MyCalculator();
		assertEquals(50, mc.mul(10, 5));
	}
	
	@Test
	public void test_mul2() 
	{
		MyCalculator mc=new MyCalculator();
		assertEquals(10, mc.mul(10, 1));
	}
	
	@Test
	public void test_div() 
	{
		MyCalculator mc=new MyCalculator();
		try {
		assertEquals(2, mc.div(4, 0));
		}
		catch(Exception e) {
			fail("Arithmetic Eception can't able to divide by Zero");
		}
	}
	

}
