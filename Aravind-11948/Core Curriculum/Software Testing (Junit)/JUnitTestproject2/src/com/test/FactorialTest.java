package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fact.Factorial;

public class FactorialTest {

	static Factorial fact;
	int num1;
	int num2;

	@BeforeClass

	public static void objectCreation() {
		fact = new Factorial();

	}

	@AfterClass

	public static void objectDeletion() {
		fact = null;
	}

	@Before

	public void initialization() {
		num1 = 3;
		num2 = 0;

	}

	@After

	public void reset(){
		num1 = 0;
		num2 = 0;

	}

	@Test
	public void testFactorial1() {
		
		int actual = fact.getFactorial(num1);
		
		int excepted = 6;
		assertEquals(excepted, actual);

	}
	
	@Test
	public void testFactorial2() {
		int actual = fact.getFactorial(num2);
		int excepted = 0;
		assertEquals(excepted, actual);

	}

}
