package com.aravind.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test_add1() {

		
		Calculator mc=new Calculator();
		int result=mc.add(10, 5);
		assertEquals(15, result);
	}
	
	
	@Test
	public void test_add2() {

		
		Calculator mc=new Calculator();
		int result=mc.add(-10, 5);
		assertEquals(-5, result);
	}
	
	
	@Test
	public void test_multi1() {

		
		Calculator mc=new Calculator();
		
		assertEquals(15, mc.multi(3, 5));
	}
	
	
	@Test
	public void test_multi2() {

		
		Calculator mc=new Calculator();
		
		assertEquals(5, mc.multi(1, 5));
	}
	
	
	//Exception 
	
	@Test
	public void test_divide() {

		try {
			
		
		Calculator mc=new Calculator();
		
		assertEquals(5, mc.divide(4, 0));
		}
		catch(Exception e)
		{
			
			fail("Invalid division  :" +e);
		}
	}
	
	
	
	@Test
	public void test_arr() {

		
		Calculator mc=new Calculator();
		int arr[]= {1,2,3,4};
		
		assertEquals(10, mc.addarray(arr));
	}

}
