package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.calc.Calculator;

public class CalculatorTest { // Test Runner

	static Calculator calc;
	int a,b;
	
	@BeforeClass
	//Before class will execute before the class loaded into memory (before obj created), it must be static
	
	public static void objectCreation() {
		calc=new Calculator();
	}
	
	@AfterClass 
	
	//After Class will execute ,once the object is deleted from tes runner (removed) from the memory, it must be static
	
	public static void objectDeletion() {
		calc=null;  //Deleting the object
	}

	@Before
	//Execute before each test case
	
	public void initialization() {
		a=10;
		b=20;
	}
	
	@After
	//Execute after each test case
	
	public void reset() {
		a=0;
		b=0;
	}
	
	
	@Test
	public void testAddition() { //Test Case
		
		//Creating object for calculator class
		
		//Calculator calc = new Calculator();
		//System.out.println("Addition");
		
		int actual = calc.addition(a,b);
		int expected = 30;
		assertEquals(expected, actual);
		
		
	}

	//@Ignore
	//@Ignore will ignore the test case
	
	public void testSubtraction() {
		
		//Calculator calc = new Calculator();
		int actual = calc.subtraction(a,b);
		int expected = -10;
		
		assertEquals(expected, actual);
		
	}

}
