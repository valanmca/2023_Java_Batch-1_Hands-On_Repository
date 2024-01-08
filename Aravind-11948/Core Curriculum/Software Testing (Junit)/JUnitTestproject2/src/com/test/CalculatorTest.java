package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.calc.Calculator;

public class CalculatorTest {

	static Calculator obj;
	int a, b;

	// before class is executed before the object creation of test runner must be
	@BeforeClass
	public static void objectCreation() {
		
		obj = new Calculator();

	}

	@AfterClass

	public static void objectDelection() {
		

		obj = null;
	}

	@Before  // excute after each test case
	public void initialization() {
		

		a = 10;
		b = 20;
	}

	@After
	public void reset() {
		

		a = 0;
		b = 0;
	}

	@Test
	public void testAddition() {

		

		int actual = obj.addition(a, b);
		int excepted = 30;
		assertEquals(excepted, actual);

	}

	// @Ignore //ignore the test case

	@Test
	public void testSubtration() {
		

		int actual = obj.subtration(a, b);
		int excepted = -10;
		assertEquals(excepted, actual);

	}

}
